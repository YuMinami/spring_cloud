package cn.mintair.springcloud.service.impl;

import cn.mintair.springcloud.dao.PaymentDao;
import cn.mintair.springcloud.entites.Payment;
import cn.mintair.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author xing
 * @Date 2021/3/17 10:26
 * @Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
