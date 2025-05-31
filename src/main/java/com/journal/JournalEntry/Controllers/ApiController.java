package com.journal.JournalEntry.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.journal.JournalEntry.Model.ChatMessage;
import com.journal.JournalEntry.Repository.ChatRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ApiController {

    @Autowired
    ChatRepository chatRepo;

    @GetMapping("/api/messages")
    public List<ChatMessage> getMessage() {
        return chatRepo.findAll();
    }
}
