package com.cloud.user.service;

import java.util.List;

import com.cloud.auth.api.domain.UserOperLog;

/**
 * 操作日志记录Service接口
 *
 * @author ai-cloud
 * @date 2022-06-05
 */
public interface IUserOperLogService {

    /**
     * 新增操作日志记录
     *
     * @param userOperLog 操作日志记录
     * @return 结果
     */
    public int insertUserOperLog(UserOperLog userOperLog);

}
