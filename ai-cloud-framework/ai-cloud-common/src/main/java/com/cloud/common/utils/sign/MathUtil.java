package com.cloud.common.utils.sign;

import java.util.Random;
import java.util.UUID;

/**
 * 盐加密方法
 *
 * @author ai-cloud
 */
public class MathUtil {

    public static final String UPPERCASE_SEED = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_SEED = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBER_SEED = "0123456789";

    private MathUtil() {
    }

    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static String get(int length, String base) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < length; ++i) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }

        return sb.toString();
    }

    public static String get(int length) {
        return get(length, "0123456789");
    }
}
