package eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/23 20:11
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class InvokerApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(InvokerApp.class).run(args);
    }
}
