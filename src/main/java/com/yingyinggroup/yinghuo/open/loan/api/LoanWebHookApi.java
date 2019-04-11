package com.yingyinggroup.yinghuo.open.loan.api;

import com.yingyinggroup.yinghuo.open.loan.LoanApiClient;
import com.yingyinggroup.yinghuo.open.loan.request.*;
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
    @Deprecated
    NotificationResponseDTO orderStatusNotification(OrderStatusCallBackDTO bankCardBindingNotificationDTO);


    /**
     * 订单作废回调
     *
     * @return
     */
    @RequestLine("POST /open-api/loan-market/merchant/order_invalid_notification")
    @Headers("Content-Type: application/json")
    NotificationResponseDTO orderInvalidNotification(String orderNo);

    /**
     * 放款结果回调
     * @param makeLoanStatusNotificationDTO
     * @return
     */
    @RequestLine("POST /open-api/loan-market/merchant/make_loan_status")
    @Headers("Content-Type: application/json")
    NotificationResponseDTO makeLoanStatusNotificationDTO(MakeLoanStatusNotificationDTO makeLoanStatusNotificationDTO);

    /**
     * 订单状态回调
     * @param orderStatusNotificationDTO
     * @return
     */
    @RequestLine("POST /open-api/loan-market/merchant/order_status_notification/v2")
    @Headers("Content-Type: application/json")
    NotificationResponseDTO orderStatusNotification(OrderStatusNotificationDTO orderStatusNotificationDTO);

    /**
     * 还款结果回调
     * @param repayStatusNotificationDTO
     * @return
     */
    @RequestLine("POST /open-api/loan-market/merchant/repay_result_status")
    @Headers("Content-Type: application/json")
    NotificationResponseDTO repayStatusNotificationDTO(RepayStatusNotificationDTO repayStatusNotificationDTO);




}
