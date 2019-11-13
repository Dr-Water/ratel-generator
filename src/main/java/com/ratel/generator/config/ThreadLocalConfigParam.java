package com.ratel.generator.config;

import java.util.HashMap;
import java.util.Map;

public class ThreadLocalConfigParam {
    private static final ThreadLocal<Map<String,String>> paramThreadLocal = new ThreadLocal<>();

    public static void set(Map<String,String> param){
        paramThreadLocal.set(param);
    }

    public static void set(String key,String val){
        if(null==paramThreadLocal.get()){
            paramThreadLocal.set(new HashMap<String,String>());
        }
        paramThreadLocal.get().put(key,val);
    }

    public static Map<String,String> get(){
        return paramThreadLocal.get();
    }

    public static String get(String key) {
        return paramThreadLocal.get().get(key);
    }
}
