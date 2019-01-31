package com.yingyinggroup.yinghuo.open.loan.response;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 给商户返回的值对象
 */
@Accessors(chain = true)
public class NotificationResponseDTO {

    /**
     * 返回值状态，0代表成功，其他是失败。
     */
    @Getter
    @Setter
    private Integer status;

}
