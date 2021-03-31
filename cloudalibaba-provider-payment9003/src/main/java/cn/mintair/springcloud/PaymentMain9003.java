package cn.mintair.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain9003
 * @Description TODO
 * @Author xing
 * @Date 2021/3/29 15:52
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9003 {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain9003.class,args);
    }
}
