package com.minclouds.client.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {
    private Md5() {
    }

    public static String md5(byte[] data) {
        return md5(data, 0, data.length);
    }

    public static String md5(byte[] data, int offset, int len) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException var5) {
            throw new RuntimeException(var5);
        }

        md.update(data, offset, len);
        byte[] secretBytes = md.digest();
        return getFormattedText(secretBytes);
    }

    public static String md5(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        return md5(fis, file.length());
    }

    public static String md5(InputStream in, long length) throws IOException {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException var11) {
            throw new RuntimeException(var11);
        }

        byte[] buffer = new byte[4096];
        int buffSize = buffer.length;
        long len = length;

        while(len != 0L) {
            int next = (int)((long)buffSize > len ? len : (long)buffSize);
            next = in.read(buffer, 0, next);
            if (next == -1) {
                throw new IOException("input stream length: " + len + " does not match the argument: " + length);
            }

            if (next != 0) {
                md.update(buffer, 0, next);
                len -= (long)next;
            } else {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException var10) {
                }
            }
        }

        byte[] secretBytes = md.digest();
        return getFormattedText(secretBytes);
    }

    private static String getFormattedText(byte[] src) {
        if (src != null && src.length != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);

            for(int i = 0; i < src.length; ++i) {
                int v = src[i] & 255;
                String hv = Integer.toHexString(v);
                if (hv.length() < 2) {
                    stringBuilder.append(0);
                }

                stringBuilder.append(hv);
            }

            return stringBuilder.toString();
        } else {
            return "";
        }
    }
}
