package com.cloud.user.service.impl;


import com.cloud.auth.api.domain.User;
import com.cloud.common.constant.UserConstants;
import com.cloud.common.utils.StringUtils;
import com.cloud.security.utils.SecurityUtils;
import com.cloud.user.dto.UserInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloud.user.mapper.UserMapper;
import com.cloud.user.service.IUserService;

/**
 * 用户信息Service业务层处理
 *
 * @author ai-cloud
 * @date 2022-05-10
 */
@Service
public class UserServiceImpl implements IUserService {


    @Autowired
    private UserMapper userMapper;

    /**
     * 校验用户名称是否唯一
     *
     * @param userName 用户名称
     * @return 结果
     */
    @Override
    public String checkUserNameUnique(String userName) {
        int count = userMapper.checkUserNameUnique(userName);
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
        if (StringUtils.isNotNull(info) && info.getId().toString() != userId) {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }


    /**
     * 注册用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    @Override
    public boolean registerUser(User user) {
        return userMapper.insert(user) > 0;
    }

    /**
     * 通过用户名查询用户
     *
     * @param username 用户名
     * @return 用户对象信息
     */
    @Override
    public User selectByUserName(String username) {
        return userMapper.selectByUserName(username);
    }

    /**
     * 查询用户信息
     *
     * @param
     * @return 用户对象信息
     */
    @Override
    public UserInfoDto selectByUserInfo() {
        //获取userId
        String userId = SecurityUtils.getUserId();
        return userMapper.selectByUserInfo(String.valueOf(userId));
    }

}
