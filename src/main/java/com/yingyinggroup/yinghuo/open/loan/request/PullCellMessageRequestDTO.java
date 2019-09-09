package com.yingyinggroup.yinghuo.open.loan.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

@ApiModel(description = "审核结果DTO")
@Data
public class PullCellMessageRequestDTO implements Serializable {

    private Long timestamp;
    private String orderNo;
}
