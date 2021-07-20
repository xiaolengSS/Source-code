package com.sourcecode.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *      集合工具类
 */
public final class CollectionUtils {

    private CollectionUtils(){

    }

    // 判断是否为空，为空则返回true,
    public static boolean isEmpty(Collection collection){
        if(collection == null || collection.isEmpty()){
            return true;
        }
        return false;
    }

    // 判断是否不为空，如果不为空则返回true,
    public static boolean isNotEmpty(Collection collection){
       return !isEmpty(collection);
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("");
        System.out.println(isNotEmpty(list));
    }
}
