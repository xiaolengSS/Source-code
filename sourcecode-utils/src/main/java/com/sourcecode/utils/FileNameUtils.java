package com.sourcecode.utils;

import java.util.UUID;

/**
 *  文件名工具类
 */
public final class FileNameUtils {

    private FileNameUtils(){

    }

    /**
     *  生成唯一的文件名
     */
    public static String getRandomImgName(String fileName) {

        // 判断文件名是否为空
        if (fileName == null || "".equals(fileName.trim())){
            throw new IllegalArgumentException();
        }

        int index = fileName.lastIndexOf(".");
        if (index == -1){
            throw new IllegalArgumentException();
        }
        // 获取文件后缀
        String suffix = fileName.substring(index);
        // 生成UUID
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        // 生成上传至云服务器的路径
        String path = DateUtils.getToday() + "-" + uuid + suffix;
        return path;
    }
}
