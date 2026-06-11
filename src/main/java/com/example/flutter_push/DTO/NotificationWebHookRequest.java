package com.example.flutter_push.DTO;


public class NotificationWebHookRequest {
    private String token;
    private String title;
    private String body;


    public String getToken() {
        return token;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}

