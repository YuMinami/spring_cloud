package cn.mintair.springcloud.service;

import cn.mintair.springcloud.entites.CommonResult;
import cn.mintair.springcloud.entites.Payment;
import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Description TODO
 * @Author xing
 * @Date 2021/3/29 16:37
 * @Version 1.0
 **/
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
