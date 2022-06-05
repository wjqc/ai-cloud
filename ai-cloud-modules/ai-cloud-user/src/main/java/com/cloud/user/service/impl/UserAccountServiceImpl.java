package com.cloud.user.service.impl;

import java.util.Date;
import java.util.List;

import com.cloud.auth.api.domain.UserAccount;
import com.cloud.common.utils.DateUtils;
import com.cloud.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloud.user.mapper.UserAccountMapper;
import com.cloud.user.service.IUserAccountService;

/**
 * 用户账户信息Service业务层处理
 *
 * @author ai-cloud
 * @date 2022-05-10
 */
@Service
public class UserAccountServiceImpl implements IUserAccountService {

    @Autowired
    private UserAccountMapper userAccountMapper;

    /**
     * 创建账户
     * @param userId
     * @param uuid
     * @param type
     * @return
     */
    @Override
    public int createAccount(String userId, String uuid, String type) {
        UserAccount account = new UserAccount();
        account.setId(IdUtils.fastSimpleUUID());
        account.setUserId(userId);
        account.setUuid(uuid);
        account.setType(type);
        account.setCreateTime(new Date());
        return userAccountMapper.insert(account);
    }
}
