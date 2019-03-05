package com.yingyinggroup.yinghuo.open.loan.api;

import com.yingyinggroup.yinghuo.open.loan.LoanApiClient;
import com.yingyinggroup.yinghuo.open.loan.request.ApprovalStatusCallBackDTO;
import com.yingyinggroup.yinghuo.open.loan.request.BankCardBindingNotificationDTO;
import com.yingyinggroup.yinghuo.open.loan.request.OrderStatusCallBackDTO;
import com.yingyinggroup.yinghuo.open.loan.response.NotificationResponseDTO;
import feign.Headers;
import feign.RequestLine;

/**
 * Created by jun.wu on 2017/8/09.
 * 聚合Api
 */
public interface LoanWebHookApi extends LoanApiClient.Api {

    /**
     * 确认绑卡结果回调
     *
     * @return
     */
    @RequestLine("POST /open-api/loan-market/merchant/bank_card_bind_notification")
    @Headers("Content-Type: application/json")
    NotificationResponseDTO notifyBankCardBindStatus(BankCardBindingNotificationDTO bankCardBindingNotificationDTO);


    /**
     * 借款审核结果回调
     *
     * @return
     */
    @RequestLine("POST /open-api/loan-market/merchant/approve_status_notification")
    @Headers("Content-Type: application/json")
    NotificationResponseDTO approveStatusNotification(ApprovalStatusCallBackDTO bankCardBindingNotificationDTO);

    /**
     * 订单状态结果回调
     *
     * @return
     */
    @RequestLine("POST /open-api/loan-market/merchant/order_status_notification")
    @Headers("Content-Type: application/json")
    NotificationResponseDTO orderStatusNotification(OrderStatusCallBackDTO bankCardBindingNotificationDTO);


    /**
     * 订单作废回调
     *
     * @return
     */
    @RequestLine("POST /open-api/loan-market/merchant/order_invalid_notification")
    @Headers("Content-Type: application/json")
    NotificationResponseDTO orderInvalidNotification(String orderNo);




}
