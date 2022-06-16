package com.cloud.user.service.impl;


import com.cloud.auth.api.domain.User;
import com.cloud.common.constant.UserAccountConstants;
import com.cloud.common.constant.UserConstants;
import com.cloud.common.utils.DateUtils;
import com.cloud.common.utils.StringUtils;
import com.cloud.common.utils.uuid.IdUtils;
import com.cloud.user.mapper.UserMapper;
import com.cloud.user.service.IUserAccountService;
import com.cloud.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息Service业务层处理
 *
 * @author ai-cloud
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserAccountService userAccountService;

    /**
     * 校验用户名称是否唯一
     *
     * @param username 用户名称
     * @return 结果
     */
    @Override
    public String checkUserNameUnique(String username) {
        int count = userMapper.checkUserNameUnique(username);
        if (count > 0) {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    /**
     * 校验手机号码是否唯一
     *
     * @param user 用户信息
     * @return
     */
    @Override
    public String checkPhoneUnique(User user) {
        String userId = StringUtils.isNull(user.getId()) ? String.valueOf(-1L) : user.getId();
        User info = userMapper.checkPhoneUnique(user.getPhone());
        if (StringUtils.isNotNull(info) && info.getId() != userId) {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }


    /**
     * 注册用户信息：新用户创建账号和账户
     *
     * @param user 用户信息
     * @return 结果
     */
    @Override
    public boolean registerUser(User user) {
        //创建用户
        user.setId(IdUtils.fastSimpleUUID());
        //创建随机用户昵称

        //创建随机用户头像
        user.setCreateBy(user.getId());
        user.setCreateTime(DateUtils.getNowDate());
        //创建账户
        userAccountService.createAccount(user.getId(), user.getDeviceId(), UserAccountConstants.ACCOUNT_TYPE_BALANCE);
        userAccountService.createAccount(user.getId(), user.getDeviceId(), UserAccountConstants.ACCOUNT_TYPE_KB);
        return userMapper.insert(user) > 0;
    }

    /**
     * 通过用户名或手机号查询用户
     *
     * @param param 用户名或手机号
     * @return 用户对象信息
     */
    @Override
    public User selectByUserNamePhone(String param) {
        return userMapper.selectByUserNamePhone(param);
    }


}
