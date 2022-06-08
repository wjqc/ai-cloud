package com.cloud.gateway.service;

import com.cloud.common.exception.CaptchaException;
import com.cloud.common.web.domain.AjaxResult;

import java.io.IOException;

/**
 * 验证码处理
 *
 * @author ai-cloud
 */
public interface ValidateCodeService {
    /**
     * 生成验证码
     */
    public AjaxResult createCaptcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    public void checkCaptcha(String key, String value) throws CaptchaException;
}
