package eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/23 19:45
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServerApp.class).run(args);
    }
}
