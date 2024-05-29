package com.mgmetehan.enumpattern.service.impl;

import com.mgmetehan.enumpattern.dto.NotificationDto;
import com.mgmetehan.enumpattern.service.NotifactionService;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationServiceImpl implements NotifactionService {

    @Override
    public String send(NotificationDto notificationDto) {
        return "Email notification sent to " + notificationDto.getTo();
    }
}

