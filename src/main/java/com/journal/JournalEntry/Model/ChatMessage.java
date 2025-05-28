package com.journal.JournalEntry.Model;

import org.springframework.web.servlet.tags.MessageTag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class ChatMessage {

    private String message;

    private String sender;

    private MessageType type;
}
