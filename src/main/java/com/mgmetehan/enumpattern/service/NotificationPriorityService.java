package com.mgmetehan.enumpattern.service;

import com.mgmetehan.enumpattern.dto.NotificationDto;

public abstract class NotificationPriorityService {
    public abstract String sendAlert(NotificationDto notificationDto);
}
