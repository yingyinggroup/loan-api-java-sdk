package com.yingyinggroup.yinghuo.open.loan.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel(description = "审核结果DTO")
@Data
public class CancelRepaySuccessResultReq {

    @ApiModelProperty(notes = "订单号", required = true)
    private String orderNo;

    @ApiModelProperty(notes = "还款期数", required = false)
    private List<Integer> periodNo;

}
