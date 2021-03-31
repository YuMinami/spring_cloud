package cn.mintair.springcloud;

import cn.mintair.springcloud.config.DataSourceProxyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName AccountService2003
 * @Description TODO
 * @Author xing
 * @Date 2021/3/30 15:57
 * @Version 1.0
 **/
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AccountService2003 {
    public static void main(String[] args){
        SpringApplication.run(AccountService2003.class,args);
    }
}
