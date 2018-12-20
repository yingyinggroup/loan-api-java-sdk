package com.yingyinggroup.yinghuo.open.loan.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@ApiModel(description = "审核结果DTO")
@Data
@AllArgsConstructor
public class ApprovalStatusCallBackDTO implements Serializable {

    @ApiModelProperty(notes = "订单号", required = true)
    private String orderNo;

    @ApiModelProperty(notes = "审核状态", required = true)
    private int approvalStatus;

    @ApiModelProperty(notes = "审核金额", required = true)
    private Long approvalAmount;

    @ApiModelProperty(notes = "审核时间(YYYY-MM-dd HH:mm:ss)", required = true)
    private String approvalTime;

    @ApiModelProperty(notes = "期数", required = true)
    private int term;

    @ApiModelProperty(notes = "期数类型", required = true)
    private String termType;

    @ApiModelProperty(notes = "审核利率(万分之一)", required = true)
    private int rate;

    @ApiModelProperty(notes = "利率类型", required = true)
    private int rateType;

    @ApiModelProperty(notes = "审核结果说明", required = false)
    private String remark;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ApprovalStatusCallBackDTO{");
        sb.append("orderNo='").append(orderNo).append('\'');
        sb.append("approvalStatus='").append(approvalStatus).append('\'');
        sb.append("approvalAmount='").append(approvalAmount).append('\'');
        sb.append("approvalTime='").append(approvalTime).append('\'');
        sb.append("term='").append(term).append('\'');
        sb.append("termType='").append(termType).append('\'');
        sb.append("rate='").append(rate).append('\'');
        sb.append("rateType='").append(rateType).append('\'');
        sb.append("remark='").append(remark).append('\'');
        return sb.toString();
    }
}
