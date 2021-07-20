package com.sourcecode.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  日期转换器
 */
public class DateConverter implements Converter<String, Date> {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // 字符串到日期的转换
    public Date convert(String source) {
        if(source == null || "".equals(source.trim())){
            return null;
        }
        try{
            return sdf.parse(source);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
