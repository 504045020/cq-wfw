package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.Pay;
import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.resp.ReturnCodeEnum;
import com.atguigu.cloud.service.PayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.annotation.Resources;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Target;
import java.util.List;

@Tag(name ="支付模块",description = "支付CURD")
@RestController
@RequestMapping("/pay")
public class PayController {

    @Resource
    private PayService payService;

    @Operation(summary = "新增",description = "新增支付信息,Json作为参数")
    @PostMapping(value = "/add")
    public ResultData<String> addPay(@RequestBody Pay pay){
        System.out.println(pay.toString());
        int result = payService.add(pay);
        return ResultData.success("success" + result);
    }

    @DeleteMapping("/{id}")
    public ResultData<String> deletePay(Integer id){
        int result = payService.delete(id);
        return ResultData.success("success" + result);
    }

    @PutMapping("/update")
    public ResultData<String> updatePay(@RequestBody Pay pay){
        System.out.println(pay.toString());
        int result = payService.update(pay);
        return ResultData.success("success" + result);
    }

    @GetMapping("/get")
    public ResultData<String> getPayById(Integer id){
        return ResultData.success("success" + payService.getById(id));
    }

    @GetMapping("/list")
    public ResultData<String> getAll(){
        return ResultData.success("success" + payService.getAll());
    }


}
