package cn.mintair.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName NacosConfigClientMain3377
 * @Description TODO
 * @Author xing
 * @Date 2021/3/25 11:08
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
    public static void main(String[] args){
        SpringApplication.run(NacosConfigClientMain3377.class,args);
    }
}
