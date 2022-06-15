package com.cloud.common.utils.sign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;

/**
 * Md5加密方法
 *
 * @author ai-cloud
 */
public class Md5Util {
    private static final Logger log = LoggerFactory.getLogger(Md5Util.class);

    public static String getMD5ofStr(String origString) {
        String origMD5 = null;

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] result = md5.digest(origString.getBytes());
            origMD5 = byteArray2HexStr(result);
            return origMD5.toLowerCase();
        } catch (Exception var4) {
            log.error(var4.getMessage(), var4);
            return origMD5;
        }
    }

    private static String byteArray2HexStr(byte[] bs) {
        StringBuilder sb = new StringBuilder();
        byte[] var2 = bs;
        int var3 = bs.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            byte b = var2[var4];
            sb.append(byte2HexStr(b));
        }

        return sb.toString();
    }

    private static String byte2HexStr(byte b) {
        int n = b;
        if (b < 0) {
            n = b & 255;
        }

        String hexStr = Integer.toHexString(n / 16) + Integer.toHexString(n % 16);
        return hexStr.toUpperCase();
    }

    private static byte[] md5(String s) {
        MessageDigest algorithm;
        try {
            algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(s.getBytes("UTF-8"));
            byte[] messageDigest = algorithm.digest();
            return messageDigest;
        } catch (Exception e) {
            log.error("MD5 Error...", e);
        }
        return null;
    }

    private static final String toHex(byte hash[]) {
        if (hash == null) {
            return null;
        }
        StringBuffer buf = new StringBuffer(hash.length * 2);
        int i;

        for (i = 0; i < hash.length; i++) {
            if ((hash[i] & 0xff) < 0x10) {
                buf.append("0");
            }
            buf.append(Long.toString(hash[i] & 0xff, 16));
        }
        return buf.toString();
    }

    public static String hash(String s) {
        try {
            return new String(toHex(md5(s)).getBytes("UTF-8"), "UTF-8");
        } catch (Exception e) {
            log.error("not supported charset...{}", e);
            return s;
        }
    }
}
