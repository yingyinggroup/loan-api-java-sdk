package com.yingyinggroup.yinghuo.open.loan.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@ApiModel(description = "审核结果DTO")
@Data
public class RepaymentPlanDTO implements Serializable {

    @ApiModelProperty(notes = "当前期数", required = true)
    private int period;

    @ApiModelProperty(notes = "当期还款状态", required = true)
    private int repayStatus;

    @ApiModelProperty(notes = "允许还款的起始日期(YYYY-MM-dd hh:mm:ss)", required = true)
    private String repayTime;

    @ApiModelProperty(notes = "服务费", required = true)
    private Long serviceFee;

    @ApiModelProperty(notes = "还款的截止日期(YYYY-MM-dd hh:mm:ss)", required = true)
    private String dueTime;

    @ApiModelProperty(notes = "用户实际已还款的时间(YYYY-MM-dd hh:mm:ss)", required = true)
    private String paidTime;

    @ApiModelProperty(notes = "当期本金", required = true)
    private Long amount;

    @ApiModelProperty(notes = "逾期费用", required = true)
    private Long overdueFee;

    @ApiModelProperty(notes = "用户实际应还款金额", required = true)
    private Long requiedRepayAmount;

    @ApiModelProperty(notes = "用户实际已还款金额", required = true)
    private Long paidAmount;

    @ApiModelProperty(notes = "还款备注", required = true)
    private String remark;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RepaymentPlanDTO{");
        sb.append("period='").append(period).append('\'');
        sb.append("repayStatus='").append(repayStatus).append('\'');
        sb.append("repayTime='").append(repayTime).append('\'');
        sb.append("serviceFee='").append(serviceFee).append('\'');
        sb.append("dueTime='").append(dueTime).append('\'');
        sb.append("paidTime='").append(paidTime).append('\'');
        sb.append("amount='").append(amount).append('\'');
        sb.append("overdueFee='").append(overdueFee).append('\'');
        sb.append("requiedRepayAmount='").append(requiedRepayAmount).append('\'');
        sb.append("paidAmount='").append(paidAmount).append('\'');
        sb.append("remark='").append(remark).append('\'');
        return sb.toString();
    }
}
