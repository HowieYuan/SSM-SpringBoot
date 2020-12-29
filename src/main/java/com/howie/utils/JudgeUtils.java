package com.howie.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Map;


public class JudgeUtils {

    public static <T> boolean isNull(T t) {
        if (null == t) {
            return true;
        } else {
            boolean boolString = t instanceof String && ("null".equalsIgnoreCase(String.valueOf(t)) || StringUtils.isBlank(String.valueOf(t)));
            if (boolString) {
                return true;
            } else {
                boolean boolCollection = t instanceof Collection && (CollectionUtils.isEmpty((Collection) t) || 0 == ((Collection) t).size());
                if (boolCollection) {
                    return true;
                } else {
                    return t instanceof Map && (CollectionUtils.isEmpty((Map) t) || 0 == ((Map) t).size());
                }
            }
        }
    }

    public static <T> boolean isNotNull(T t) {
        return !isNull(t);
    }
}
