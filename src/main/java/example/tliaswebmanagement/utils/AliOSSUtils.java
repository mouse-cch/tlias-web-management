package example.tliaswebmanagement.utils;

import com.aliyun.oss.*;
import com.aliyun.oss.common.auth.DefaultCredentialProvider;
import com.aliyun.oss.common.comm.SignVersion;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Component
public class AliOSSUtils {
    String endpoint = "oss-cn-qingdao.aliyuncs.com";
    String region = "cn-qingdao";
    // 通过环境变量获取访问凭证
    String accessKeyId = System.getenv("OSS_ACCESS_KEY_ID");
    String accessKeySecret = System.getenv("OSS_ACCESS_KEY_SECRET");
    // 创建凭证提供者
    DefaultCredentialProvider provider = new DefaultCredentialProvider(accessKeyId, accessKeySecret);

    // 配置客户端参数
    ClientBuilderConfiguration clientBuilderConfiguration = new ClientBuilderConfiguration();

    // 填写Bucket名称，例如examplebucket。
    String bucketName = "web-tlias5765";

    public String uploadFile(MultipartFile file) throws IOException {
        //获取文件原始名
        String filename = file.getOriginalFilename();
        //获取文件扩展名
        int index = filename.lastIndexOf(".");
        String extname = filename.substring(index);
        //利用uuid为上传的文件建立有唯一标识的文件名
        String newFilename = UUID.randomUUID() + extname;
        //转存文件到OSS

        // 显式声明使用V4签名算法
        clientBuilderConfiguration.setSignatureVersion(SignVersion.V4);
        // 初始化OSS客户端
        OSS ossClient = OSSClientBuilder.create()
                .credentialsProvider(provider)
                .clientConfiguration(clientBuilderConfiguration)
                .region(region)
                .endpoint(endpoint)
                .build();
        ossClient.putObject(bucketName, newFilename, file.getInputStream());

        String url =  bucketName + '.' + endpoint + newFilename;
        ossClient.shutdown();

        return url;
    }
}
