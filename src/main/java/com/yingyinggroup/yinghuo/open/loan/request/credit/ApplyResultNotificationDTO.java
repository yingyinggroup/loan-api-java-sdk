package com.yingyinggroup.yinghuo.open.loan.request.credit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel(description = "授信审核回调DTO")
@Data
public class ApplyResultNotificationDTO {

    @ApiModelProperty(notes = "授信申请编号", required = true)
    private String applyNo;

    @ApiModelProperty(notes = "授信结果状态", required = true)
    private Integer creditStatus;

    @ApiModelProperty(notes = "授信总额度,单位分", required = true)
    private Long creditline;

    @ApiModelProperty(notes = "当前有效额度(能够使用的额度), 单位分", required = true)
    private Long available;

    @ApiModelProperty(notes = "允许的期数", required = true)
    private List<Integer> periods;

    @ApiModelProperty(notes = "额度有效期截止时间", required = true)
    private Long deadline;

    @ApiModelProperty(notes = "备注")
    private String remark;

}
