package config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/3/2 17:27
 * @description
 */
@RestController
public class ConfigClientController {
    @Value("${content}")
    private String content;

    @RequestMapping("/")
    public String home() {
        return "content: " + content;
    }
}
