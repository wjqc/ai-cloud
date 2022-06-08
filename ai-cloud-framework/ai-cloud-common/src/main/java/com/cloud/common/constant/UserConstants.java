package com.cloud.common.constant;

/**
 * 用户常量信息
 *
 * @author
 */
public class UserConstants {
    /**
     * 正常状态
     */
    public static final String NORMAL = "0";

    /**
     * 异常状态
     */
    public static final String EXCEPTION = "1";

    /**
     * 校验返回结果码
     */
    public final static String UNIQUE = "0";

    public final static String NOT_UNIQUE = "1";

    /**
     * 用户名长度限制
     */
    public static final int USERNAME_MIN_LENGTH = 6;

    public static final int USERNAME_MAX_LENGTH = 12;

    /**
     * 密码长度限制
     */
    public static final int PASSWORD_MIN_LENGTH = 8;

    public static final int PASSWORD_MAX_LENGTH = 18;
}
