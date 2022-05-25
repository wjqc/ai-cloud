package com.cloud.user.service;

import java.util.List;

import com.cloud.user.domain.UserConfig;

/**
 * 参数配置Service接口
 *
 * @author ai-cloud
 * @date 2022-05-20
 */
public interface IUserConfigService {

    /**
     * 根据键名查询参数配置信息
     *
     * @param configKey 参数键名
     * @return 参数键值
     */
    public String selectConfigByKey(String configKey);


}
