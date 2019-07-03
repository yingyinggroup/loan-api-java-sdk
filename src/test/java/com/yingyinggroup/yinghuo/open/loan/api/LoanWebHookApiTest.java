package com.yingyinggroup.yinghuo.open.loan.api;

import com.yingyinggroup.yinghuo.open.loan.LoanApiClient;
import com.yingyinggroup.yinghuo.open.loan.request.ApprovalStatusCallBackDTO;
import com.yingyinggroup.yinghuo.open.loan.request.BankCardBindingNotificationDTO;
import com.yingyinggroup.yinghuo.open.loan.request.OrderStatusCallBackDTO;
import com.yingyinggroup.yinghuo.open.loan.request.RepaymentPlanDTO;
import com.yingyinggroup.yinghuo.open.loan.response.NotificationResponseDTO;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * API tests for LoanWebHookApi
 */
public class LoanWebHookApiTest {
    public static final String host = "http://10.100.2.41:9080";
    public static final String APP_KEY = "JHc0adb646f6f8439aa50f87adfa142801";
    public static final String APP_SECRET = "abd61c0cf7b50663f6c9beed2013d234";
    private LoanWebHookApi loanWebHookApi;

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


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

    private static final String ORDER_NO ="lo341302381156368384";

    @Test
    public void notifyAudit() {
        ApprovalStatusCallBackDTO approvalStatusCallBackDTO = new ApprovalStatusCallBackDTO();
        approvalStatusCallBackDTO.setApprovalAmount(500000L);
        approvalStatusCallBackDTO.setApprovalStatus(13100);
        approvalStatusCallBackDTO.setApprovalTime(sdf.format(new Date()));
        approvalStatusCallBackDTO.setOrderNo(ORDER_NO);
        approvalStatusCallBackDTO.setRate(36);
        approvalStatusCallBackDTO.setRateType(4);
        approvalStatusCallBackDTO.setRemark("审核");
        approvalStatusCallBackDTO.setTerm(4);
        approvalStatusCallBackDTO.setTermType(6);
        Map<String, String> map = new HashMap<String, String>();
        map.put("3", "qi");
        map.put("4", "qi");
        approvalStatusCallBackDTO.setCanSelectTerm(map);
        loanWebHookApi.approveStatusNotification(approvalStatusCallBackDTO);
    }

    @Test
    public void notifyMakeLoan() {
        OrderStatusCallBackDTO orderStatusCallBackDTO = new OrderStatusCallBackDTO();
        orderStatusCallBackDTO.setUpdateTime(sdf.format(new Date()));
        orderStatusCallBackDTO.setOrderNo(ORDER_NO);
        orderStatusCallBackDTO.setAmount(250000L);
        orderStatusCallBackDTO.setOrderStatus(16300);
        orderStatusCallBackDTO.setRemark("测试");
        orderStatusCallBackDTO.setTotalFee(30000L);
        orderStatusCallBackDTO.setTotalInterest(30000L);
        orderStatusCallBackDTO.setTotalPrincipal(250000L);
        orderStatusCallBackDTO.setTotalRepayAmount(310000L);
        List<RepaymentPlanDTO> repaymentPlanDTOS = new ArrayList<RepaymentPlanDTO>();
        int currentPeriod =3;
        for (int i = 1;i <= currentPeriod; i++) {
            RepaymentPlanDTO repaymentPlanDTO = new RepaymentPlanDTO();
            repaymentPlanDTO.setPeriod(i);
            repaymentPlanDTO.setInterest(10000L);
            repaymentPlanDTO.setServiceFee(10000L);
            repaymentPlanDTO.setRepayTime(sdf.format(new Date(System.currentTimeMillis() + 10 * 24 * 60 * 60 * 1000 * i)));
            repaymentPlanDTO.setRepayStatus(16002);
            repaymentPlanDTO.setRepayAmount(250000 / 3 + 20000L);
            repaymentPlanDTO.setRemark("还款计划");
            repaymentPlanDTO.setPrincipal(250000L/3);
            repaymentPlanDTO.setPaidAmount(250000 / 3 + 20000L);
            repaymentPlanDTO.setPaidTime(sdf.format(new Date(System.currentTimeMillis() + 10 * 24 * 60 * 60 * 1000 * i)));
            repaymentPlanDTO.setOverdueFee(0L);
            repaymentPlanDTO.setOverdueDays(0);
            repaymentPlanDTOS.add(repaymentPlanDTO);
        }


        for (int i = currentPeriod + 1 ; i <= 3; i++) {
            RepaymentPlanDTO repaymentPlanDTO = new RepaymentPlanDTO();
            repaymentPlanDTO.setPeriod(i);
            repaymentPlanDTO.setInterest(10000L);
            repaymentPlanDTO.setServiceFee(10000L);
            repaymentPlanDTO.setRepayTime(sdf.format(new Date(System.currentTimeMillis() + 10 * 24 * 60 * 60 * 1000 * i)));
            repaymentPlanDTO.setRepayStatus(16001);
            repaymentPlanDTO.setRepayAmount(250000 / 3 + 20000L);
            repaymentPlanDTO.setRemark("还款计划");
            repaymentPlanDTO.setPrincipal(250000L/3);
            repaymentPlanDTOS.add(repaymentPlanDTO);
        }
        orderStatusCallBackDTO.setRepaymentPlans(repaymentPlanDTOS);
        loanWebHookApi.orderStatusNotification(orderStatusCallBackDTO);
    }


}
