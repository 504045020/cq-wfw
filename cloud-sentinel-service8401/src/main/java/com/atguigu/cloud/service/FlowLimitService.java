package com.atguigu.cloud.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

public interface FlowLimitService {

    /**
     * 哨兵所需资源
     */
    public  void common();
}
