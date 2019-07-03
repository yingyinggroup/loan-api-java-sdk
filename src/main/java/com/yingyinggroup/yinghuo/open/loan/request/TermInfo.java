package com.yingyinggroup.yinghuo.open.loan.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TermInfo {
    @ApiModelProperty(notes = "期数")
    private Integer term;
    @ApiModelProperty(notes = "期数单位")
    private String termUnit;
    @ApiModelProperty(notes = "对应最大可借金额（分）")
    private Long maxAmount;
    @ApiModelProperty(notes = "对应最小可借金额（分）")
    private Long minAmount;
}
