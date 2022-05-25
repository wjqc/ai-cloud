package com.cloud.user.service;

import com.cloud.auth.api.domain.User;
import com.cloud.user.dto.UserInfoDto;

import java.util.List;

/**
 * 用户信息Service接口
 *
 * @author ai-cloud
 * @date 2022-05-10
 */
public interface IUserService {

    /**
     * 校验用户名称是否唯一
     *
     * @param userName 用户名称
     * @return 结果
     */
    public String checkUserNameUnique(String userName);

    /**
     * 校验手机号码是否唯一
     *
     * @param user 用户信息
     * @return 结果
     */
    public String checkPhoneUnique(User user);

    /**
     * 注册用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    public boolean registerUser(User user);


    /**
     * 通过用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户对象信息
     */
    public User selectByUserName(String username);


    /**
     * 查询用户信息
     *
     * @param
     * @return 用户对象信息
     */
    public UserInfoDto selectByUserInfo();

}
