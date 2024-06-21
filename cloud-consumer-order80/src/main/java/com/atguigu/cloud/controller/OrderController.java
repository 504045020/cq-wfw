package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;

@RestController
public class OrderController implements Serializable {

    public static final String PaymentSer_URL = "http://localhost:8001/provider";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping(value = "/consumer/pay/add")
    public ResultData<String> addOrder(@RequestBody  PayDTO payDTO){
        return  restTemplate.postForObject(PaymentSer_URL + "/pay/add", payDTO, ResultData.class);
    }


}
