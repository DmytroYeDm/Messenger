package org.example.messenger.server;

import org.example.messenger.models.Message;

import java.util.List;

public class MessageService {
    private final MessageDaoImpl messageDao = new MessageDaoImpl();

    public void saveMessage(Message message) {
        messageDao.saveMessage(message);
    }
    public List<Message> findMessagesBetweenUsers(String user1, String user2) {
        return messageDao.findMessagesBetweenUsers(user1, user2);
    }
}
