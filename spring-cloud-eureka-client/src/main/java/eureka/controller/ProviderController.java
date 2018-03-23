package eureka.controller;

import common.model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/23 19:48
 * @description
 */
@RestController
public class ProviderController {

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId") Integer personId,
                             HttpServletRequest request) {
        Person person = new Person(personId, "Niko", 18);
        person.setMessage(request.getRequestURL().toString());
        return person;
    }
}
