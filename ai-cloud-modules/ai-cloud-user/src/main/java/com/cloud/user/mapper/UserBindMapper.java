package com.cloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.user.domain.UserBind;
import com.cloud.user.dto.BindAlipayDto;
import com.cloud.user.dto.BindBankDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户绑定银行卡或支付宝Mapper接口
 *
 * @author ai-cloud
 */
@Mapper
public interface UserBindMapper extends BaseMapper<UserBind> {

    /**
     * 查询用户的绑定信息
     *
     * @param belongBank 提现方式；1：支付宝 2：银行卡
     * @param userId     用户id
     * @return
     */
    UserBind selectByBelongBankUserId(@Param("belongBank") Integer belongBank, @Param("userId") String userId);

    /**
     * 查询银行卡绑定信息
     *
     * @param userId 用户id
     * @return
     */
    List<BindBankDto> selectByWalletBindBankInfo(@Param("userId") String userId);

    /**
     * 查询支付宝绑定信息
     *
     * @param userId 用户id
     * @return
     */
    List<BindAlipayDto> selectByWalletBindAlipayInfo(@Param("userId") String userId);

}
