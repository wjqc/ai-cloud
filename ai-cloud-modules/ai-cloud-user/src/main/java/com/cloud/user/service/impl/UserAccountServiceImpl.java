package com.cloud.user.service.impl;

import java.util.List;

import com.cloud.common.utils.DateUtils;
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


}
