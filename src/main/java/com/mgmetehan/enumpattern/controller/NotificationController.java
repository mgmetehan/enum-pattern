package com.mgmetehan.enumpattern.controller;

import com.mgmetehan.enumpattern.dto.NotificationDto;
import com.mgmetehan.enumpattern.type.NotificationType;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notifications")
@RequiredArgsConstructor
public class NotificationController {

    @PostMapping("/sendNotification")
    public String sendNotification(@RequestBody NotificationDto notificationDto) {
        NotificationType type = NotificationType.fromType(notificationDto.getNotificationType());
        return type.getService().send(notificationDto);
    }
}
