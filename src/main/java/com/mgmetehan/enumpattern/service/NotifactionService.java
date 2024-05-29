package com.mgmetehan.enumpattern.service;

import com.mgmetehan.enumpattern.dto.NotificationDto;

public interface NotifactionService {
    String send(NotificationDto notificationDto);
}
