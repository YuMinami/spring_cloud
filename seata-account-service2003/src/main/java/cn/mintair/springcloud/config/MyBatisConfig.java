package cn.mintair.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisConfig
 * @Description TODO
 * @Author xing
 * @Date 2021/3/30 15:26
 * @Version 1.0
 **/
@Configuration
@MapperScan({"cn.mintair.springcloud.dao"})
public class MyBatisConfig {
}
