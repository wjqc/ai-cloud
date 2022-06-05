package com.cloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.auth.api.domain.UserOperLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * 操作日志记录Mapper接口
 * 
 * @author ai-cloud
 * @date 2022-06-05
 */
@Mapper
public interface UserOperLogMapper extends BaseMapper<UserOperLog> {

}
