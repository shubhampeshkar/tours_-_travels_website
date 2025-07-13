package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.model.Notification;
import com.example.matoshritoursandtravels.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    @Autowired
    private NotificationRepository notificationRepository;

    @GetMapping("/sendNotification")
    public String showNotificationForm() {
        return "sendNotification.html";
    }

    @PostMapping("/sendNotification")
    @ResponseBody
    public String sendNotification(@RequestBody Notification notification) {
        notificationRepository.save(notification);
        return "Notification sent successfully!";
    }
}
