package eureka;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/23 19:53
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceProviderApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceProviderApp.class).run(args);
    }
}
