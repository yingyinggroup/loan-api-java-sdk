package com.yingyinggroup.yinghuo.open.loan.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "还款状态回调DTO")
public class RepayStatusNotificationDTO {

    @ApiModelProperty(notes = "订单编号", required = true)
    private String orderNo;

    @ApiModelProperty(notes = "订单状态", required = true)
    private Integer orderStatus;

    @ApiModelProperty(notes = "还款期号", required = true)
    private Integer periodNo;

    @ApiModelProperty(notes = "还款金额（分）", required = true)
    private Long paidAmount;

    @ApiModelProperty(notes = "还款时间（13位时间戳）", required = true)
    private Long paidDate;

    @ApiModelProperty(notes = "还款结果", required = true)
    private Integer status;

    @ApiModelProperty(notes = "备注信息")
    private String remark;
}
