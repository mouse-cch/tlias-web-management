package example.tliaswebmanagement;

import com.aliyun.oss.*;
import com.aliyun.oss.common.auth.*;
import com.aliyun.oss.common.comm.SignVersion;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import java.io.File;

public class Demo {

    public static void main(String[] args) throws Exception {
//        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-qingdao.aliyuncs.com";
//        String region = "cn-qingdao";
//        // 填写Bucket名称，例如examplebucket。
//        String bucketName = "web-tlias5765";
//        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
//        String objectName = "1.txt";
//        // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
//        // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件。
//        String filePath= "C:\\Users\\Administrator\\Desktop\\1.txt";
//        // 填写Bucket所在地域。以华东1（杭州）为例，Region填写为cn-hangzhou。
//
//
//        // 创建OSSClient实例。
//        // 当OSSClient实例不再使用时，调用shutdown方法以释放资源。
//        String accessKeyId = System.getenv("OSS_ACCESS_KEY_ID");
//        String accessKeySecret = System.getenv("OSS_ACCESS_KEY_SECRET");
//
//
//        // 创建凭证提供者
//        DefaultCredentialProvider provider = new DefaultCredentialProvider(accessKeyId, accessKeySecret);
//
//        // 配置客户端参数
//        ClientBuilderConfiguration clientBuilderConfiguration = new ClientBuilderConfiguration();
//        // 显式声明使用V4签名算法
//        clientBuilderConfiguration.setSignatureVersion(SignVersion.V4);
//
//        // 初始化OSS客户端
//        OSS ossClient = OSSClientBuilder.create()
//                .credentialsProvider(provider)
//                .clientConfiguration(clientBuilderConfiguration)
//                .region(region)
//                .endpoint(endpoint)
//                .build();
//        try {
//            // 创建PutObjectRequest对象。
//            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, objectName, new File(filePath));
//            // 如果需要上传时设置存储类型和访问权限，请参考以下示例代码。
//            // ObjectMetadata metadata = new ObjectMetadata();
//            // metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
//            // metadata.setObjectAcl(CannedAccessControlList.Private);
//            // putObjectRequest.setMetadata(metadata);
//
//            // 上传文件。
//            ossClient.putObject(putObjectRequest);
//        } catch (OSSException oe) {
//            System.out.println("Caught an OSSException, which means your request made it to OSS, "
//                    + "but was rejected with an error response for some reason.");
//            System.out.println("Error Message:" + oe.getErrorMessage());
//            System.out.println("Error Code:" + oe.getErrorCode());
//            System.out.println("Request ID:" + oe.getRequestId());
//            System.out.println("Host ID:" + oe.getHostId());
//        } catch (ClientException ce) {
//            System.out.println("Caught an ClientException, which means the client encountered "
//                    + "a serious internal problem while trying to communicate with OSS, "
//                    + "such as not being able to access the network.");
//            System.out.println("Error Message:" + ce.getMessage());
//        } finally {
//            if (ossClient != null) {
//                ossClient.shutdown();
//            }
//        }

    }
}