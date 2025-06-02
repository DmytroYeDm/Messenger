package org.example.messenger.messages;

import org.example.messenger.models.Message;

import java.util.List;

public class ServerGetChatMessagesMessage {
    private final String type = "sendChatMessages";
    private List<Message> chatMessages;

    public ServerGetChatMessagesMessage(List<Message> chatMessages) {
        this.chatMessages = chatMessages;
    }

    public String getType() {
        return type;
    }

    public List<Message> getChatMessages() {
        return chatMessages;
    }
}
