package com.rpuzon.machtyper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
@Slf4j
public class MessageController {

    @MessageMapping("/messages")
    @SendTo("/topic/messages")
    public Message message(Message message) {
        log.info("{} sent: {}", message.getUsername(), message.getContent());
        return new Message(message.getUsername(), HtmlUtils.htmlEscape(message.getContent()));
    }
}

