package com.yingyinggroup.yinghuo.open.loan.request.credit;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "授信订单还款计划")
@Data
public class RepayPlan {

    @ApiModelProperty(notes = "当前期数", required = true)
    private Integer period;

    @ApiModelProperty(notes = "还款计划状态", required = true)
    private Integer repayStatus;

    @ApiModelProperty(notes = "当前期本金", required = true)
    private Long amount;

    @ApiModelProperty(notes = "当前期服务费", required = true)
    private Long serviceFee;

    @ApiModelProperty(notes = "当前期实际应还金额", required = true)
    private Long requiredRepayAmount;

    @ApiModelProperty(notes = "逾期费用", required = true)
    private Long overdueFee;

    @ApiModelProperty(notes = "还款截止时间", required = true)
    private Long deadline;

    @ApiModelProperty(notes = "偿还完成的时间")
    private Long repaidTime;

    @ApiModelProperty(notes = "利息费用", required = true)
    private Long interest;

    @ApiModelProperty(notes = "预期天数", required = true)
    private Integer overdueDays = 0;

    @ApiModelProperty(notes = "当前期备注")
    private String remark;
}