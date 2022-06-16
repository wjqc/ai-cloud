package com.cloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.user.domain.UserWithdrawApply;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户提现申请记录Mapper接口
 *
 * @author ai-cloud
 */
@Mapper
public interface UserWithdrawApplyMapper extends BaseMapper<UserWithdrawApply> {

}
