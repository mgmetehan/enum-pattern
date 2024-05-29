package com.mgmetehan.enumpattern.service.impl;

import com.mgmetehan.enumpattern.dto.NotificationDto;
import com.mgmetehan.enumpattern.repository.UserRepository;
import com.mgmetehan.enumpattern.service.NotifactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmsNotificationServiceImpl implements NotifactionService {

    private final UserRepository userRepository;

    @Override
    public String send(NotificationDto notificationDto) {
        userRepository.save(notificationDto.toUser(notificationDto));
        return "Sms notification sent to " + notificationDto.getTo();
    }
}

