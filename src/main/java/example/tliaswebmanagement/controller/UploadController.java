package example.tliaswebmanagement.controller;

import example.tliaswebmanagement.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RestController
public class UploadController {
    @PostMapping("/upload")
    public Result upload(String username,Integer age, MultipartFile image) throws IOException {
        log.info("文件上传：{},{},{}",username,age,image);
        //获取文件原始名
        String filename = image.getOriginalFilename();
        //获取文件扩展名
        int index = filename.lastIndexOf(".");
        String extname = filename.substring(index);
        //利用uuid为上传的文件建立有唯一标识的文件名
        String newFilename = UUID.randomUUID() + extname;
        //转存文件
        image.transferTo(new File("D:\\Program Files\\tlias-web-management\\src\\main\\resources\\upLoadFile\\"+newFilename));

        return Result.success();
    }
}
