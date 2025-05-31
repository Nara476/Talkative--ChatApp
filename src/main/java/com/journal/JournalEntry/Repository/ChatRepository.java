package com.journal.JournalEntry.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.journal.JournalEntry.Model.ChatMessage;

public interface ChatRepository extends MongoRepository<ChatMessage, ObjectId> {

}
