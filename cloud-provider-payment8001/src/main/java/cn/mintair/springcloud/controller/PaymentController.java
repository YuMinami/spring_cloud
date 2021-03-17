package cn.mintair.springcloud.controller;

import cn.mintair.springcloud.entites.CommonResult;
import cn.mintair.springcloud.entites.Payment;
import cn.mintair.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author xing
 * @Date 2021/3/17 10:29
 * @Version 1.0
 **/
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentServiceImpl paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("添加的结果："+result);
        if(result>0){
            return new CommonResult(200,"success",result);
        }else {
            return new CommonResult(444,"failed",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (null != payment) {
            return new CommonResult<>(200,"success",payment);
        }else {
            return new CommonResult<>(444,"no record ,search id:"+id,null);
        }
    }
}
