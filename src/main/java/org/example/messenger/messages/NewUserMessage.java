package org.example.messenger.messages;

public class NewUserMessage {
    private final String type = "newUserMessage";
    private String newUserUsername;

    public NewUserMessage(String newUserUsername) {
        this.newUserUsername = newUserUsername;
    }

    public String getType() {
        return type;
    }

    public String getNewUserUsername() {
        return newUserUsername;
    }
}
