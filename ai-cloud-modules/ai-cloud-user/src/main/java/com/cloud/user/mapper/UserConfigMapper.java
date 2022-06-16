package com.cloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.auth.api.domain.UserConfig;
import org.apache.ibatis.annotations.Mapper;

/**
 * 参数配置Mapper接口
 *
 * @author ai-cloud
 */
@Mapper
public interface UserConfigMapper extends BaseMapper<UserConfig> {

    /**
     * 查询参数配置信息
     *
     * @param userConfig 参数配置信息
     * @return 参数配置信息
     */
    public UserConfig selectConfig(UserConfig userConfig);

}
