package com.congz.sm.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.ObjectMetadata;

import java.io.File;
import java.util.UUID;

/**
 * @ClassName AliOSSUtil
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/26
 **/
public class AliOSSUtil {
    /**
     * 将本地file上传到阿里云指定域名的目录下，并用UUID重命名
     * @param file 待传文件
     * @return String 上传成功返回的url
     */
    public static String ossUpload(File file){
        String bucketDomain = "https://stu-manager.oss-cn-beijing.aliyuncs.com/";
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
        String accessKeyId = "LTAI4G4cKheXHciwKFtFFJwk";
        String accessKeySecret = "ex8iUl6SOKA7Svm0SZ7cwXt3pgYPeI";
        String bucketName = "cong-zhang";
        String fileDir = "img/";
        String fileName = file.getName();
        //上传后的文件名生成，这里将客户端的文件名保留扩展名，主文件名用UUID生成
        String fileKey = UUID.randomUUID().toString() + fileName.substring(fileName.indexOf("."));
        //创建OSSClient实例
        OSS ossClient = new OSSClientBuilder().build(endpoint,accessKeyId,accessKeySecret);
        //阿里云图片若是直接下载类型，修改ContentType
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentType("image/jpg");
        //上传file到bucketName的fileDir目录下，用fileKey作为新文件存储
        ossClient.putObject(bucketName,fileDir + fileKey,file,objectMetadata);
        //关闭OSSClient实例
        ossClient.shutdown();
        //返回url组成，域名+目录+新文件名
        return bucketDomain + fileDir + fileKey;
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\zhangcong\\Pictures\\Saved Pictures\\test.jpg");
        String url = ossUpload(file);
        System.out.println(url);
    }
}

