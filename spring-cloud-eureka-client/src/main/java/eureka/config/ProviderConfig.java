package eureka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/27 11:52
 * @description
 */
@Configuration
public class ProviderConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
