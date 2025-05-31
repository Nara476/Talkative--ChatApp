package com.journal.JournalEntry.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.servlet.tags.MessageTag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Chats")
@Data
@AllArgsConstructor
@Builder
public class ChatMessage {

    @Id
    private ObjectId id;

    private String message;

    private String sender;

    private MessageType type;
}
