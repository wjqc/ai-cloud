package com.cloud.user.service.impl;

import com.cloud.common.constant.Constants;
import com.cloud.common.redis.service.RedisService;
import com.cloud.common.text.Convert;
import com.cloud.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloud.user.mapper.UserConfigMapper;
import com.cloud.auth.api.domain.UserConfig;
import com.cloud.user.service.IUserConfigService;

/**
 * 参数配置Service业务层处理
 *
 * @author ai-cloud
 * @date 2022-05-20
 */
@Service
public class UserConfigServiceImpl implements IUserConfigService {

    @Autowired
    private UserConfigMapper userConfigMapper;

    @Autowired
    private RedisService redisService;

    /**
     * 根据键名查询参数配置信息
     *
     * @param configKey 参数key
     * @return 参数键值
     */
    @Override
    public String selectConfigByKey(String configKey) {
        String configValue = Convert.toStr(redisService.getCacheObject(getCacheKey(configKey)));
        if (StringUtils.isNotEmpty(configValue)) {
            return configValue;
        }
        UserConfig userConfig = new UserConfig();
        userConfig.setConfigKey(configKey);
        UserConfig retConfig = userConfigMapper.selectConfig(userConfig);
        if (StringUtils.isNotNull(retConfig)) {
            redisService.setCacheObject(getCacheKey(configKey), retConfig.getConfigValue());
            return retConfig.getConfigValue();
        }
        return StringUtils.EMPTY;
    }

    /**
     * 设置cache key
     *
     * @param configKey 参数键
     * @return 缓存键key
     */
    private String getCacheKey(String configKey) {
        return Constants.SYS_CONFIG_KEY + configKey;
    }
}
