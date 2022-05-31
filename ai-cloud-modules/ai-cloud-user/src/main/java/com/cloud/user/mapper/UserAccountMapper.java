package com.cloud.user.mapper;

import java.math.BigDecimal;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.auth.api.domain.UserAccount;
import feign.Param;

/**
 * 用户账户信息Mapper接口
 *
 * @author ai-cloud
 * @date 2022-05-10
 */
public interface UserAccountMapper extends BaseMapper<UserAccount> {

    /**
     * 查询账户的可用余额
     *
     * @param userId type
     * @return 可用余额
     */
    public BigDecimal selectAvailableBalanceByUserIdAndType(@Param("userId") String userId, @Param("type") String type);

    /**
     * 查询用户存在账户数
     *
     * @param userId
     * @return 存在账户数
     */
    public Integer selectCountByUserId(@Param("userId") String userId);


}
