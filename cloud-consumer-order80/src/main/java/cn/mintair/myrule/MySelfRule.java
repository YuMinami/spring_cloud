package cn.mintair.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * @ClassName MySelfRule
 * @Description TODO
 * @Author xing
 * @Date 2021/3/18 17:17
 * @Version 1.0
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
