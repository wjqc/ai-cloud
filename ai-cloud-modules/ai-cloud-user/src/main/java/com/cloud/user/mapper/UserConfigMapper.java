package com.cloud.user.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.user.domain.UserConfig;

/**
 * 参数配置Mapper接口
 *
 * @author ai-cloud
 * @date 2022-05-20
 */
public interface UserConfigMapper extends BaseMapper<UserConfig> {


    /**
     * 查询参数配置信息
     *
     * @param userConfig 参数配置信息
     * @return 参数配置信息
     */
    public UserConfig selectConfig(UserConfig userConfig);

}