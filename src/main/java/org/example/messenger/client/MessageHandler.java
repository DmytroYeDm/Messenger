package org.example.messenger.client;

import org.example.messenger.models.Message;

import java.util.List;

public interface MessageHandler {
    void onIncomingMessage(String from, String message, String time);
    void onNewUser(String username);
    void showAllMessages(List<Message> chatMessages);
}
