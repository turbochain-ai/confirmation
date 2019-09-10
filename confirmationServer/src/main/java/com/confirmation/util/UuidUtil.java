package com.confirmation.util;

public class UuidUtil {
    public static String getUUID() {
        return java.util.UUID.randomUUID().toString().replace("-", "");
    }
}
