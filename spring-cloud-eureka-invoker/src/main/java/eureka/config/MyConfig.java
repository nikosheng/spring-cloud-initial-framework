package eureka.config;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import eureka.ping.MyPing;
import eureka.rule.MyRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/24 15:30
 * @description
 */
@Configuration
public class MyConfig {

//    @Bean
    public IRule getRule() {
        return new MyRule();
    }

//    @Bean
    public IPing getPing() {
        return new MyPing();
    }
}
