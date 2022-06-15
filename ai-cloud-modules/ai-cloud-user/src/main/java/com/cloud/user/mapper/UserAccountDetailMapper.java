package com.cloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.user.domain.UserAccountDetail;
import com.cloud.user.dto.BillDetailDto;
import com.cloud.user.dto.BillDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户账户明细记录Mapper接口
 *
 * @author ai-cloud
 */
public interface UserAccountDetailMapper extends BaseMapper<UserAccountDetail> {

    /**
     * 查询钱包账单
     *
     * @param userId   用户id
     * @param dealType 交易类型
     * @param start    开始时间
     * @param end      结束时间
     * @return
     */
    List<BillDto> selectByDealType(@Param("userId") String userId, @Param("dealType") String dealType, @Param("start") String start, @Param("end") String end);

    /**
     * 查询账单明细
     *
     * @param userId   用户id
     * @param detailId 账单id
     * @return
     */
    List<BillDetailDto> selectByDetail(@Param("userId") String userId, @Param("detailId") String detailId);

}
