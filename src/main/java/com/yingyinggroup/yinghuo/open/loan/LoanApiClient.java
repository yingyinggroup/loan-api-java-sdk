package com.yingyinggroup.yinghuo.open.loan;

import com.yingyinggroup.yinghuo.open.loan.core.YinghuoOpenJsonEncoder;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.slf4j.Slf4jLogger;

public class LoanApiClient {
    public interface Api {
    }

    private final String basePath;
    private Feign.Builder feignBuilder;

    public LoanApiClient(String host, String appKey, String appSecret) {
        basePath = host + "/";
        feignBuilder = Feign.builder()
                .logger(new Slf4jLogger())
                .logLevel(Logger.Level.FULL)
                .encoder(new YinghuoOpenJsonEncoder(appKey, appSecret))
                .decoder(new GsonDecoder());
    }

    public String getBasePath() {
        return basePath;
    }

    public Feign.Builder getFeignBuilder() {
        return feignBuilder;
    }

    public LoanApiClient setFeignBuilder(Feign.Builder feignBuilder) {
        this.feignBuilder = feignBuilder;
        return this;
    }

    public <T extends Api> T buildClient(Class<T> clientClass) {
        return feignBuilder.target(clientClass, basePath);
    }

}
