package websocket.controller;

import common.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import websocket.model.SocketMessage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/28 10:58
 * @description
 */
@Controller
public class WebSocketController {
    @Autowired
    private SimpMessagingTemplate template;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(Person person) {
        person.setId(1);
        person.setName("Niko");
        return "/hello";
    }

    @MessageMapping("/send")
    @SendTo("/topic/send")
    public SocketMessage send(SocketMessage message) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        message.setTimestamp(format.format(new Date()));
        return message;
    }

    @Scheduled(fixedRate = 1000)
    @SendTo("/topic/callback")
    public Object callback() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        template.convertAndSend("/topic/callback", format.format(new Date()));
        return "callback";
    }
}
