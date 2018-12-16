package com.yingyinggroup.yinghuo.open.loan.utils;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class SignUtils {

    public static String sign(String requestMethod, String body,
                              String appKey,
                              String appSecret) {
        byte[] signBytes = new StringBuilder(requestMethod).append(":")
                .append(body).append(":")
                .append(appKey).append(":")
                .append(appSecret).append(":")
                .toString().getBytes();
        return HMACSHA256.sign(signBytes, appSecret.getBytes());
    }

    public boolean validSign(String body, HttpServletRequest request, String appSecret) {
        String authorization = request.getHeader("Authorization");
        String requestMethod = request.getMethod();
        String[] keys = authorization.split(":");
        String appKey = keys[0];
        String signatureFromRequest = keys[1];
        String signature = SignUtils.sign(requestMethod, body, appKey, appSecret);
        return StringUtils.equals(signatureFromRequest, signature);
    }
}
