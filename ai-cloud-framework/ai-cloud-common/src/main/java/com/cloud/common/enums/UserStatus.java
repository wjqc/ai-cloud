package com.cloud.common.enums;

/**
 * 用户状态
 *
 * @author ai-cloud
 *
 */
public enum UserStatus {
    OK("0", "正常"), DISABLE("2", "停用"), DELETED("2", "删除");

    private final String code;
    private final String info;

    UserStatus(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
