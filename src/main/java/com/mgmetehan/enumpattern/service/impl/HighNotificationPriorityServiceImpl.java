package com.mgmetehan.enumpattern.service.impl;

import com.mgmetehan.enumpattern.dto.NotificationDto;
import com.mgmetehan.enumpattern.service.NotificationPriorityService;
import org.springframework.stereotype.Service;

@Service
public class HighNotificationPriorityServiceImpl extends NotificationPriorityService {
    @Override
    public String sendAlert(NotificationDto notificationDto) {
        return "High notification sent to " + notificationDto.getTo();
    }
}
