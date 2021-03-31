package cn.mintair.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName MainApp8401
 * @Description TODO
 * @Author xing
 * @Date 2021/3/29 11:32
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8401 {
    public static void main(String[] args){
        SpringApplication.run(MainApp8401.class,args);
    }
}
