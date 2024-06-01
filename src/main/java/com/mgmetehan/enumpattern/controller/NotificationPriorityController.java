package com.mgmetehan.enumpattern.controller;

import com.mgmetehan.enumpattern.dto.NotificationDto;
import com.mgmetehan.enumpattern.type.NotificationPriorityType;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/notifications")
@RequiredArgsConstructor
public class NotificationPriorityController {

    @PostMapping("/sendNotification")
    public String sendNotification(@RequestHeader("X-Notification-Priority-Type") NotificationPriorityType priorityType,
                                   @RequestBody NotificationDto notificationDto) {
        return priorityType.execute().sendAlert(notificationDto);
    }
}
