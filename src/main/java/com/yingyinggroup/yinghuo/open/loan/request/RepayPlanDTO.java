package com.yingyinggroup.yinghuo.open.loan.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(description = "审核结果DTO")
@Data
public class RepayPlanDTO implements Serializable {

    @ApiModelProperty(notes = "当前期数", required = true)
    private int period;

    @ApiModelProperty(notes = "当期还款状态", required = true)
    private int repayStatus;

    @ApiModelProperty(notes = "允许还款的起始日期13位时间戳", required = true)
    private Long repayTime;

    @ApiModelProperty(notes = "用户实际已还款的时间13位时间戳")
    private Long paidTime;

    @ApiModelProperty(notes = "当期本金", required = true)
    private Long principal;

    @ApiModelProperty(notes = "当期利息", required = true)
    private Long interest;

    @ApiModelProperty(notes = "服务费", required = true)
    private Long serviceFee;

    @ApiModelProperty(notes = "逾期费用")
    private Long overdueFee;

    @ApiModelProperty(notes = "用户实际应还款金额", required = true)
    private Long repayAmount;

    @ApiModelProperty(notes = "用户实际已还款金额", required = true)
    private Long paidAmount;

    @ApiModelProperty(notes = "逾期天数")
    private int overdueDays;

    @ApiModelProperty(notes = "还款备注", required = true)
    private String remark;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RepayPlanDTO{");
        sb.append("period='").append(period).append('\'');
        sb.append("repayStatus='").append(repayStatus).append('\'');
        sb.append("repayTime='").append(repayTime).append('\'');
        sb.append("serviceFee='").append(serviceFee).append('\'');
        sb.append("paidTime='").append(paidTime).append('\'');
        sb.append("principal='").append(principal).append('\'');
        sb.append("overdueFee='").append(overdueFee).append('\'');
        sb.append("repayAmount='").append(repayAmount).append('\'');
        sb.append("paidAmount='").append(paidAmount).append('\'');
        sb.append("remark='").append(remark).append('\'');
        return sb.toString();
    }
}
