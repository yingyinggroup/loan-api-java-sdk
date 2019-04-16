package com.yingyinggroup.yinghuo.open.loan.api;

import com.yingyinggroup.yinghuo.open.loan.LoanApiClient;
import com.yingyinggroup.yinghuo.open.loan.request.BankCardBindingNotificationDTO;
import com.yingyinggroup.yinghuo.open.loan.request.OrderStatusNotificationDTO;
import com.yingyinggroup.yinghuo.open.loan.request.RepaymentPlanDTO;
import com.yingyinggroup.yinghuo.open.loan.response.NotificationResponseDTO;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * API tests for LoanWebHookApi
 */
public class LoanWebHookApiTest {
    public static final String host = "http://localhost:9080";
    public static final String APP_KEY = "aaa";
    public static final String APP_SECRET = "bbb";
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

    @Test
    public void notifyOrderStatusV2() {
        OrderStatusNotificationDTO orderStatusNotificationDTO = new OrderStatusNotificationDTO();
        orderStatusNotificationDTO.setOrderNo("lo315162220236767232");
        orderStatusNotificationDTO.setRemark("");
        orderStatusNotificationDTO.setStatus(15100);
        orderStatusNotificationDTO.setUpdateTime(1555383157000L);
        List<RepaymentPlanDTO> repaymentPlanDTOS = new ArrayList<RepaymentPlanDTO>();

        // {"interest":5000,"overdueDays":0,"overdueFee":0,"paidAmount":0,"period":1,"principal":166667,
        // "remark":"","repayAmount":238334,"repayStatus":16000,"repayTime":"2019-04-16 10:52","serviceFee":66667},
        RepaymentPlanDTO repaymentPlanDTO = new RepaymentPlanDTO();
        repaymentPlanDTO.setInterest(5000L);
        repaymentPlanDTO.setOverdueDays(0);
        repaymentPlanDTO.setOverdueFee(0L);
        repaymentPlanDTO.setPaidAmount(0L);
        repaymentPlanDTO.setPeriod(1);
        repaymentPlanDTO.setPrincipal(166667L);
        repaymentPlanDTO.setRemark("");
        repaymentPlanDTO.setRepayAmount(238334L);
        repaymentPlanDTO.setRepayStatus(16001);
        repaymentPlanDTO.setRepayTime("2019-04-16 10:52:00");
        repaymentPlanDTO.setServiceFee(66667L);
        repaymentPlanDTOS.add(repaymentPlanDTO);

        // {"interest":5000,"overdueDays":0,"overdueFee":0,"paidAmount":0,"period":2,"principal":166666,"remark":"",
        // "repayAmount":238332,"repayStatus":16000,"repayTime":"2019-04-26 10:52","serviceFee":66666},
        repaymentPlanDTO = new RepaymentPlanDTO();
        repaymentPlanDTO.setInterest(5000L);
        repaymentPlanDTO.setOverdueDays(0);
        repaymentPlanDTO.setOverdueFee(0L);
        repaymentPlanDTO.setPaidAmount(0L);
        repaymentPlanDTO.setPeriod(2);
        repaymentPlanDTO.setPrincipal(166666L);
        repaymentPlanDTO.setRemark("");
        repaymentPlanDTO.setRepayAmount(238332L);
        repaymentPlanDTO.setRepayStatus(16001);
        repaymentPlanDTO.setRepayTime("2019-04-26 10:52:00");
        repaymentPlanDTO.setServiceFee(66666L);
        repaymentPlanDTOS.add(repaymentPlanDTO);

        //"interest":5000,"overdueDays":0,"overdueFee":0,"paidAmount":0,"period":3,"principal":166667,"remark":"",
        // "repayAmount":238334,"repayStatus":16000,"repayTime":"2019-05-06 10:52","serviceFee":66667}
        repaymentPlanDTO = new RepaymentPlanDTO();
        repaymentPlanDTO.setInterest(5000L);
        repaymentPlanDTO.setOverdueDays(0);
        repaymentPlanDTO.setOverdueFee(0L);
        repaymentPlanDTO.setPaidAmount(0L);
        repaymentPlanDTO.setPeriod(3);
        repaymentPlanDTO.setPrincipal(166667L);
        repaymentPlanDTO.setRemark("");
        repaymentPlanDTO.setRepayAmount(238334L);
        repaymentPlanDTO.setRepayStatus(16001);
        repaymentPlanDTO.setRepayTime("2019-05-06 10:52:00");
        repaymentPlanDTO.setServiceFee(66667L);
        repaymentPlanDTOS.add(repaymentPlanDTO);

        orderStatusNotificationDTO.setRepaymentPlans(repaymentPlanDTOS);

        NotificationResponseDTO responseDTO = loanWebHookApi.orderStatusNotification(orderStatusNotificationDTO);
        System.out.println(repaymentPlanDTO);
    }


}
