package org.example.messenger.server;

import org.example.messenger.models.Message;

import java.util.List;

public interface MessageDao {
    public void saveMessage (Message message);
    public List<Message> findMessagesBetweenUsers (String userFrom, String userTo);
}
