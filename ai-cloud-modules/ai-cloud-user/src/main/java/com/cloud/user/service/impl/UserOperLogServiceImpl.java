package com.cloud.user.service.impl;

import java.util.List;

import com.cloud.auth.api.domain.UserOperLog;
import com.cloud.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloud.user.mapper.UserOperLogMapper;
import com.cloud.user.service.IUserOperLogService;

/**
 * 操作日志记录Service业务层处理
 *
 * @author ai-cloud
 * @date 2022-06-05
 */
@Service
public class UserOperLogServiceImpl implements IUserOperLogService {

    @Autowired
    private UserOperLogMapper userOperLogMapper;

    /**
     * 新增操作日志记录
     *
     * @param userOperLog 操作日志记录
     * @return 结果
     */
    @Override
    public int insertUserOperLog(UserOperLog userOperLog) {
        userOperLog.setOperTime(DateUtils.getNowDate());
        return userOperLogMapper.insert(userOperLog);
    }

}
