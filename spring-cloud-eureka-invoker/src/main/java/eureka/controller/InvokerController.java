package eureka.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import common.model.Person;
import eureka.feign.PersonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/23 20:07
 * @description
 */
@RestController
@Configuration
public class InvokerController {
    @Autowired
    private PersonClient personClient;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/router", method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand(fallbackMethod = "getPersonFallBack")
    public String router() {
        RestTemplate template = getRestTemplate();
        String json = template.getForObject("http://cloud-provider/person/1", String.class);
        return json;

//        Person p = personClient.getPerson(2);
//        return p.getMessage();
    }


    /**
     * 回退方法
     * @return
     */
    public String getPersonFallBack() {
        return "request error!!!";
    }
}
