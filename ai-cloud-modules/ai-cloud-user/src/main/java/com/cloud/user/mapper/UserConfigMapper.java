package com.cloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.auth.api.domain.UserConfig;

/**
 * 参数配置Mapper接口
 *
 * @author ai-cloud
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
