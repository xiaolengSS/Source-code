package com.sourcecode.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  时间工具类
 */
public final class DateUtils {

    // 根据指定的格式化字符串获取当前时间
    public static String getToday(String pattern){
        pattern = pattern == null ? "yyyyMMDDHHmmss" : "yyyyMMdd";
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String result = sdf.format(date);
        return result;
    }

    // 根据指定的格式化字符串获取当前时间
    public static String getToday(){
        return getToday(null);
    }


}
