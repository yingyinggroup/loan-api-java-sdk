package com.yingyinggroup.yinghuo.open.loan.request.credit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel(description = "授信订单还款计划回调DTO")
@Data
public class RepayPlanNotificationDTO {

    @ApiModelProperty(notes = "订单编号", required = true)
    private String orderNo;

    @ApiModelProperty(notes = "还款计划", required = true)
    private List<RepayPlan> repayPlans;

}
