package com.atguigu.cloud.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.atguigu.cloud.service.FlowLimitService;
import org.springframework.stereotype.Service;

@Service
public class FlowLimitServiceImpl implements FlowLimitService {
    @Override
    @SentinelResource(value = "common")
    public void common() {
        System.out.println("-----FlowLimit come in----");
    }
}
