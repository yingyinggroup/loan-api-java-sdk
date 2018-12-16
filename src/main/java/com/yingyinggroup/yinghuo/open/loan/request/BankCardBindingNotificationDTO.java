package com.yingyinggroup.yinghuo.open.loan.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "确认绑卡DTO")
public class BankCardBindingNotificationDTO implements Serializable {

    @ApiModelProperty(notes = "订单号", required = true)
    private String orderNo;

    @ApiModelProperty(notes = "状态码", required = true)
    private String status;

    @ApiModelProperty(notes = "结果信息", required = true)
    private String comment;

    public String getOrderNo() {
        return orderNo;
    }

    public BankCardBindingNotificationDTO setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public BankCardBindingNotificationDTO setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public BankCardBindingNotificationDTO setComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BankCardBindingNotificationDTO{");
        sb.append("orderNo='").append(orderNo).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", comment='").append(comment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
