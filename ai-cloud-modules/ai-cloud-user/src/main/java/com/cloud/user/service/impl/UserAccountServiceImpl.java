package com.cloud.user.service.impl;

import com.cloud.auth.api.domain.UserAccount;
import com.cloud.common.constant.UserAccountConstants;
import com.cloud.common.utils.DateUtils;
import com.cloud.common.utils.StringUtils;
import com.cloud.common.utils.uuid.IdUtils;
import com.cloud.security.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloud.user.mapper.UserAccountMapper;
import com.cloud.user.service.IUserAccountService;

import java.math.BigDecimal;

/**
 * 用户账户信息Service业务层处理
 *
 * @author ai-cloud
 */
@Service
public class UserAccountServiceImpl implements IUserAccountService {

    @Autowired
    private UserAccountMapper userAccountMapper;

    /**
     * 创建账户
     *
     * @param userId
     * @param deviceId
     * @param type
     * @return
     */

    @Override
    public int createAccount(String userId, String deviceId, String type) {
        UserAccount userAccount = new UserAccount();
        userAccount.setId(IdUtils.fastSimpleUUID());
        userAccount.setUserId(userId);
        userAccount.setDeviceId(deviceId);
        userAccount.setType(type);
        userAccount.setCreateBy(userId);
        userAccount.setCreateTime(DateUtils.getNowDate());
        return userAccountMapper.insert(userAccount);
    }


}
