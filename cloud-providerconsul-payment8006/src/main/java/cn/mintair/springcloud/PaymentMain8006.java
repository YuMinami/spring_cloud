package cn.mintair.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain8006
 * @Description TODO
 * @Author xing
 * @Date 2021/3/18 11:16
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain8006.class,args);
    }
}
