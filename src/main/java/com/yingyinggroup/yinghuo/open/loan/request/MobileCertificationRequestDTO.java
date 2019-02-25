package com.yingyinggroup.yinghuo.open.loan.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "运营商认证DTO")
@Data
public class MobileCertificationRequestDTO {

    @ApiModelProperty(notes = "订单号", required = true)
    private String orderNo;

}
