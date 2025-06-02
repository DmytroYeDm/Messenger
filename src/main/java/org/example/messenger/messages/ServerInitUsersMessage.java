package org.example.messenger.messages;

import java.util.List;

public class ServerInitUsersMessage {
    private List<String> usernames;

    public ServerInitUsersMessage() {

    }

    public void setUsernames(List<String> usernames) {
        this.usernames = usernames;
    }
    public List<String> getUsernames() {
        return usernames;
    }
}
