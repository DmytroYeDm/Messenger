package org.example.messenger.messages;

public class InitializeUsersMessage {
    private final String type = "initializeUsers";
    private String username;

    public InitializeUsersMessage(String username) {
        this.username = username;
    }
    public String getType() {
        return type;
    }
    public String getUsername() {
        return username;
    }
}
