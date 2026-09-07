package example.tliaswebmanagement.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "alyun.oss")
public class AliOSSPropertiesUtils {
    private String endpoint;
    private String region;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;
}
