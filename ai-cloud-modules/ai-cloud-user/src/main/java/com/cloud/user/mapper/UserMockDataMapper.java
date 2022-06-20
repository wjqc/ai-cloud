package com.cloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.user.domain.UserMockData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户随机信息Mapper接口
 *
 * @author ai-cloud
 */
@Mapper
public interface UserMockDataMapper extends BaseMapper<UserMockData> {

    /**
     * 查询用户随机信息列表
     *
     * @param type 类型：1：昵称 2：头像
     * @return 用户随机信息集合
     */
    public List<UserMockData> selectUserMockDataList(@Param("type") Integer type);

}
