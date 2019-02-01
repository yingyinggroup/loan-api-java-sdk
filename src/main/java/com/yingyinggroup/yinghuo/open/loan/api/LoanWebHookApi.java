package com.yingyinggroup.yinghuo.open.loan.api;

import com.yingyinggroup.yinghuo.open.loan.LoanApiClient;
import com.yingyinggroup.yinghuo.open.loan.request.BankCardBindingNotificationDTO;
import com.yingyinggroup.yinghuo.open.loan.response.NotificationResponseDTO;
import feign.Headers;
import feign.RequestLine;

/**
 * Created by jun.wu on 2017/8/09.
 * 聚合Api
 */
public interface LoanWebHookApi extends LoanApiClient.Api {

    /**
     * 查询渠道内的产品列表
     *
     * @return
     */
    @RequestLine("POST /api/webhook/loan-api/bank_card_bind_notification")
    @Headers("Content-Type: application/json")
    NotificationResponseDTO notifyBankCardBindStatus(BankCardBindingNotificationDTO bankCardBindingNotificationDTO);


}
