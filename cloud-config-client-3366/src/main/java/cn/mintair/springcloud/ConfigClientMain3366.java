package cn.mintair.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ConfigClientMain3366
 * @Description TODO
 * @Author xing
 * @Date 2021/3/23 13:55
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {
    public static void main(String[] args){
        SpringApplication.run(ConfigClientMain3366.class,args);
    }
}
