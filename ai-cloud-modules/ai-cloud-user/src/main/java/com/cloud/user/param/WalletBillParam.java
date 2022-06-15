package com.cloud.user.param;

import com.cloud.common.web.page.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 绑定支付宝参数
 *
 * @author ai-cloud
 */
@Data
@ApiModel("账单请求参数")
public class WalletBillParam extends PageParam {

    @ApiModelProperty(value = "交易类型；1：充值 2：提现 3：消费 4：转账 5：红包 6： 退款 7：其他", example = "1")
    private String dealType;

    @ApiModelProperty(value = "开始时间(yyyy-MM-dd)", example = "2020-01-01")
    private String start;

    @ApiModelProperty(value = "结束时间(yyyy-MM-dd)", example = "2030-12-31")
    private String end;

}
