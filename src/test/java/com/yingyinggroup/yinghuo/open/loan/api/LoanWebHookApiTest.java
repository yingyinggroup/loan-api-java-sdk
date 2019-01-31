package com.yingyinggroup.yinghuo.open.loan.api;

import com.yingyinggroup.yinghuo.open.loan.LoanApiClient;
import com.yingyinggroup.yinghuo.open.loan.request.BankCardBindingNotificationDTO;
import com.yingyinggroup.yinghuo.open.loan.response.NotificationResponseDTO;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for LoanWebHookApi
 */
public class LoanWebHookApiTest {
    public static final String host = "http://localhost:9080";
    public static final String APP_KEY = "JH584b9e36405a5e6201dd2649e9340b63";
    public static final String APP_SECRET = "f7552811e14e70d18726005b5375cf35";
    private LoanWebHookApi loanWebHookApi;


    @Before
    public void setup() {
        loanWebHookApi = new LoanApiClient(host, APP_KEY, APP_SECRET)
                .buildClient(LoanWebHookApi.class);
    }


    @Test
    public void notifyBankCardBindStatusTest() {
        BankCardBindingNotificationDTO bankCardBindingNotificationDTO = new BankCardBindingNotificationDTO()
                .setOrderNo("123")
                .setStatus("0003")
                .setComment("绑卡成功");
        NotificationResponseDTO notificationResponseDTO = loanWebHookApi.notifyBankCardBindStatus(bankCardBindingNotificationDTO);
        System.out.println("result:" + notificationResponseDTO.getStatus());
    }


}
