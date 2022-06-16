package com.cloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.auth.api.domain.UserLoginLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户登录记录Mapper接口
 *
 * @author ai-cloud
 */
@Mapper
public interface UserLoginLogMapper extends BaseMapper<UserLoginLog> {

}
