package com.atguigu.cloud.controller;

import com.atguigu.cloud.service.FlowLimitService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @Resource
    private FlowLimitService flowLimitService;

    @GetMapping("/a")
    public String testA() {
        return "testA";
    }

    @GetMapping("/b")
    public String testB() {
        return "testB";
    }

    @GetMapping("/c")
    public String testC() {
        flowLimitService.common();
        return "testC";
    }

    @GetMapping("/d")
    public String testD() {
        flowLimitService.common();
        return "testD";
    }

    @GetMapping("/e")
    public String testE() {
        return "排队等待"+System.currentTimeMillis();
    }


}
