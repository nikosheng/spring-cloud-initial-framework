package eureka.feign;

import common.model.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/24 17:08
 * @description
 */
@FeignClient("cloud-provider")
public interface PersonClient {
    @RequestMapping(method = RequestMethod.GET, value = "/person/{personId}")
    Person getPerson(@PathVariable("personId") Integer personId);
}
