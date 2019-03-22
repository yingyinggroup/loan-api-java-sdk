package com.yingyinggroup.yinghuo.open.loan.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(description = "订单状态回调（v2）DTO")
public class OrderStatusNotificationDTO {

    @ApiModelProperty(notes = "订单编号", required = true)
    private String orderNo;

    @ApiModelProperty(notes = "订单状态", required = true)
    private Integer status;

    @ApiModelProperty(notes = "状态更新时间", required = true)
    private Long updateTime;

    @ApiModelProperty(notes = "备注信息")
    private String remark;

    @ApiModelProperty(notes = "订单的还款计划", required = true)
    private List<RepaymentPlanDTO> repaymentPlans;
}
