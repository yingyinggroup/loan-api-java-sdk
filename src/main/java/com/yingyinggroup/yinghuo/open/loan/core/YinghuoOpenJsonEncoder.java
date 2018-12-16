package com.yingyinggroup.yinghuo.open.loan.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yingyinggroup.yinghuo.open.loan.utils.SignUtils;
import feign.RequestTemplate;
import feign.codec.EncodeException;
import feign.codec.Encoder;

import java.lang.reflect.Type;

public class YinghuoOpenJsonEncoder implements Encoder {
    private final SerializeConfig config = SerializeConfig.getGlobalInstance();
    private final String appKey;
    private final String appSecret;

    public YinghuoOpenJsonEncoder(String appKey, String appSecret) {
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    @Override
    public void encode(Object object, Type bodyType, RequestTemplate template) throws EncodeException {
        String body = JSON.toJSONString(object, config, SerializerFeature.SortField);
        String requestMethod = template.method();
        String signature = SignUtils.sign(requestMethod, body, appKey, appSecret);
        String authorization = new StringBuilder(appKey)
                .append(":")
                .append(signature).toString();
        template.header("Authorization", authorization);
        template.body(body);

    }

}
