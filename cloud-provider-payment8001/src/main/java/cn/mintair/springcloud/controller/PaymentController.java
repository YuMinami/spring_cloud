package cn.mintair.springcloud.controller;

import cn.mintair.springcloud.entites.CommonResult;
import cn.mintair.springcloud.entites.Payment;
import cn.mintair.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private PaymentServiceImpl paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("添加的结果："+result);
        if(result>0){
            return new CommonResult(200,"success,serverPort:"+serverPort,result);
        }else {
            return new CommonResult(444,"failed,serverPort:"+serverPort,null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (null != payment) {
            return new CommonResult<>(200,"success,serverPort:"+serverPort,payment);
        }else {
            return new CommonResult<>(444,"no record ,search id:"+id+",serverPort:"+serverPort,null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("*********server:"+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info("*********instance:"+instance.getPort()+instance.getHost()+instance.getInstanceId());
        }
        return this.discoveryClient;
    }


}
