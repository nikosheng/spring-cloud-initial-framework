package eureka.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import common.model.Person;
import eureka.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/27 11:49
 * @description
 */
@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "getPersonFallBack")
    public Person getPerson(Integer id) {
        return null;
    }

    /**
     * 回退方法
     * @param id
     * @return
     */
    public Person getPersonFallBack(Integer id) {
        return new Person(0, "Niko", -1, "request error");
    }
}
