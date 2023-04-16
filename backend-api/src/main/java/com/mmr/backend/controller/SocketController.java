package com.mmr.backend.controller;

import com.mmr.backend.domain.MessageMdl;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/1.0.0")
public class SocketController {
    @MessageMapping("/user-all")
    @SendTo("/topic/user")
    public MessageMdl send(@Payload MessageMdl message) {
        return message;
    }
}
