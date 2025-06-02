package org.example.messenger.messages;

public class ServerMessage {
    private String type;
    private String details;
    public ServerMessage() {

    }
    public ServerMessage(String type, String details) {
        this.type = type;
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
