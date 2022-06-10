package com.cloud.user.mapper;

import java.math.BigDecimal;
import java.util.Map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.auth.api.domain.UserAccount;
import org.apache.ibatis.annotations.Param;

/**
 * 用户账户信息Mapper接口
 *
 * @author ai-cloud
 *
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
     * @return
     */
    public Integer selectCountByUserId(@Param("userId") String userId);

    /**
     * 查询是否设置支付密码
     *
     * @param userId type
     * @return
     */
    public UserAccount selectByUserIdType(@Param("userId") String userId, @Param("type") String type);

    /**
     * 查询用户的支付密码和盐
     * param userId
     *
     * @return
     */
    public Map selectPasswordByUserId(@Param("userId") String userId);

    /**
     * 修改支付密码
     * param password salt userId
     *
     * @return
     */
    public void updatePasswordSaltByUserId(@Param("password") String password, @Param("salt") String salt, @Param("userId") String userId);

    /*
     *减少账户余额
     *param userId amount type
     *
     * @return
     */
    public void updateAvailableBalance(@Param("userId") String userId, @Param("amount") BigDecimal amount, @Param("type") String type);

}
