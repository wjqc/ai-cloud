package com.cloud.common.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


/**
 * 流水号
 *
 * @author ai-cloud
 */
public class SerialNumberUtils {

    /**
     * 账户变更记录流水
     */
    public static final String SNUMBER_NUMBER = "b";


    /**
     * 用户id和随机数总长度
     */
    private static final int maxLength = 12;

    /**
     * 用户id和随机数总长度
     */
    private static final int maxLengthCode = 6;

    /**
     * 生成固定长度随机码
     *
     * @param n 长度
     */
    private static long getRandom(long n) {
        long min = 1, max = 9;
        for (int i = 1; i < n; i++) {
            min *= 10;
            max *= 10;
        }
        long rangeLong = (((long) (new Random().nextDouble() * (max - min)))) + min;
        return rangeLong;
    }


    /**
     * 根据id进行加密+加随机数组成固定长度编码
     */
    private static String toOrderCode(String id) {
        String idStr = id;
        StringBuilder idsbs = new StringBuilder();
        /*for (int i = idStr.length() - 1; i >= 0; i--) {
            idsbs.append(r[idStr.charAt(i) - '0']);
        }*/
        return idsbs.append(getRandom(maxLengthCode)).toString();
    }

    /**
     * 生成时间戳
     */
    private static String getDateTimeCode() {
        DateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(new Date());
    }

    /**
     * 生成不带类别标头的编码
     *
     * @param userId
     */
    private static synchronized String getCodeOrder(String userId) {
        userId = userId == null ? "11000" : userId;
        return getDateTimeCode() + toOrderCode(userId);
    }

    /**
     * 生成账户变更记录流水
     *
     * @param userId
     */
    public static String getOrderCode(String userId) {
        return SNUMBER_NUMBER + getCodeOrder(userId);
    }

}
