package com.cloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.auth.api.domain.UserRegistryLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户注册记录Mapper接口
 *
 * @author ai-cloud
 */
@Mapper
public interface UserRegistryLogMapper extends BaseMapper<UserRegistryLog> {

}
