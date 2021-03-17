package cn.mintair.springcloud.service;

import cn.mintair.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
