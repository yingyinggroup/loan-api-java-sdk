package com.yingyinggroup.yinghuo.open.loan.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@ApiModel(description = "订单状态DTO")
@Data
public class OrderStatusCallBackDTO implements Serializable {

    @ApiModelProperty(notes = "订单号", required = true)
    private String orderNo;

    @ApiModelProperty(notes = "订单状态", required = true)
    private int orderStatus;

    @ApiModelProperty(notes = "放款金额", required = false)
    private Long amount;

    @ApiModelProperty(notes = "总应还款金额", required = false)
    private Long totalRepayAmount;

    @ApiModelProperty(notes = "总服务费", required = false)
    private Long totalFee;

    @ApiModelProperty(notes = "总本金", required = false)
    private Long totalPrincipal;

    @ApiModelProperty(notes = "总利息", required = false)
    private Long totalInterest;

    @ApiModelProperty(notes = "状态变更时间(YYYY-MM-dd HH:mm:ss)", required = true)
    private String updateTime;

    @ApiModelProperty(notes = "备注", required = false)
    private String remark;

    @ApiModelProperty(notes = "还款计划", required = false)
    private List<RepaymentPlanDTO> repaymentPlans;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OrderStatusCallBackDTO{");
        sb.append("orderNo='").append(orderNo).append('\'');
        sb.append("orderStatus='").append(orderStatus).append('\'');
        sb.append("amount='").append(amount).append('\'');
        sb.append("updateTime='").append(updateTime).append('\'');
        sb.append("remark='").append(remark).append('\'');
        sb.append("repaymentPlans='").append(repaymentPlans).append('\'');
        return sb.toString();
    }
}
