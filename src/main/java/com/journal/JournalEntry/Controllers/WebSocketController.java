package com.journal.JournalEntry.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.journal.JournalEntry.Model.ChatMessage;
import com.journal.JournalEntry.Repository.ChatRepository;

@Controller
public class WebSocketController {

    @Autowired
    ChatRepository chatRepo;

    @MessageMapping("/chat.sendmessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload ChatMessage message) {
        chatRepo.save(message);
        return message;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor header) {
        header.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }

}
