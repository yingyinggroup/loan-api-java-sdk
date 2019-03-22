package com.yingyinggroup.yinghuo.open.loan.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "放款结果回调DTO")
public class MakeLoanStatusNotificationDTO implements Serializable {

    @ApiModelProperty(notes = "订单编号", required = true)
    private String orderNo;

    @ApiModelProperty(notes = "放款状态", required = true)
    private Integer status;

    @ApiModelProperty(notes = "到账金额（分）", required = true)
    private Long receiveAmount;

    @ApiModelProperty(notes = "总本金（分）", required = true)
    private Long totalPrincipal;

    @ApiModelProperty(notes = "总利息（分）", required = true)
    private Long totalInterest;

    @ApiModelProperty(notes = "总服务费（分）", required = true)
    private Long totalFee;

    @ApiModelProperty(notes = "总应还金额（分）", required = true)
    private Long totalRepayAmount;

    @ApiModelProperty(notes = "放款时间（13位时间戳）", required = true)
    private Long makeLoanTime;

    @ApiModelProperty(notes = "备注信息")
    private String remark;
}
