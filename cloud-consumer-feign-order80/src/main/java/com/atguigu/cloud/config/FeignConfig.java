package com.atguigu.cloud.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public Retryer myRetryer() {
        //  return Retryer.NEVER_RETRY; Feign默认配置不走重试策略
        return new Retryer.Default(100, 1000, 3); // 100ms重试，重试3次，每次重试间隔1000ms
    }

    /***
     * 配置Feign日志级别
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
