package com.cloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.user.domain.UserBind;
import org.apache.ibatis.annotations.Param;

/**
 * 用户绑定银行卡或支付宝Mapper接口
 *
 * @author ai-cloud
 */
public interface UserBindMapper extends BaseMapper<UserBind> {

    /**
     * 查询用户的绑定信息
     *
     * @param belongBank 提现方式；1：支付宝 2：银行卡
     * @param userId     用户id
     * @return
     */
    UserBind selectByBelongBankUserId(@Param("belongBank") Integer belongBank, @Param("userId") String userId);

}
