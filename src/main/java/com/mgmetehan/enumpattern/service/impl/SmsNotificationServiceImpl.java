package com.mgmetehan.enumpattern.service.impl;

import com.mgmetehan.enumpattern.dto.NotificationDto;
import com.mgmetehan.enumpattern.service.NotifactionService;
import org.springframework.stereotype.Service;

@Service
public class SmsNotificationServiceImpl implements NotifactionService {

    @Override
    public String send(NotificationDto notificationDto) {
        return "Sms notification sent to " + notificationDto.getTo();
    }
}

