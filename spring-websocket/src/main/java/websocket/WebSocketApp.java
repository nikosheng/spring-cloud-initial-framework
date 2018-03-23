package websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/28 10:56
 * @description
 */
@SpringBootApplication
@EnableScheduling
public class WebSocketApp {
    public static void main(String[] args) {
        SpringApplication.run(WebSocketApp.class, args);
    }
}
