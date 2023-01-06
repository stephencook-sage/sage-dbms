package com.example.sagedbms;

import java.util.UUID;

public class settingsUtils {

    public static String generateGuid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
