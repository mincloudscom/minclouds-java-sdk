package com.minclouds.client.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AES {
    public AES() {
    }

    public static String encrypt(String content, String password) {
        try {
            if (content.isEmpty()) {
                return "";
            } else {
                SecretKeySpec key = new SecretKeySpec(password.getBytes(), "AES");
                Cipher cipher = Cipher.getInstance("AES");
                byte[] bytes = content.getBytes(StandardCharsets.UTF_8);
                cipher.init(1, key);
                byte[] result = cipher.doFinal(bytes);
                return Base64.getEncoder().encodeToString(result);
            }
        } catch (Exception var6) {
            System.out.println(var6.getMessage());
            return null;
        }
    }

    public static String decrypt(String content, String password) {
        try {
            byte[] bytes = Base64.getDecoder().decode(content);
            SecretKeySpec key = new SecretKeySpec(password.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, key);
            byte[] result = cipher.doFinal(bytes);
            return new String(result);
        } catch (Exception var6) {
            System.out.println(var6.getMessage());
            return "";
        }
    }
}
