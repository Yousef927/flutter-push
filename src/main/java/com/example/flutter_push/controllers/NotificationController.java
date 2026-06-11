package com.example.flutter_push.controllers;


import com.example.flutter_push.DTO.NotificationWebHookRequest;
import com.example.flutter_push.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/push")
@CrossOrigin(origins = "*")
public class NotificationController {


        @Autowired
        private  NotificationService notificationService;

        @PostMapping("/send")
        public String sendPush(@RequestBody NotificationWebHookRequest request) {
            try {
                notificationService.sendNotification(
                        request.getToken(),
                        request.getTitle(),
                        request.getBody()
                );
                return "Push notification sent successfully";
            } catch (Exception e) {
                e.printStackTrace();
                return "Failed to send push notification: " + e.getMessage();
            }
        }
    }



