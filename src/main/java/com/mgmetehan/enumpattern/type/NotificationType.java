package com.mgmetehan.enumpattern.type;

import com.mgmetehan.enumpattern.service.NotifactionService;
import com.mgmetehan.enumpattern.service.impl.EmailNotificationServiceImpl;
import com.mgmetehan.enumpattern.service.impl.SmsNotificationServiceImpl;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum NotificationType {
    SMS("sms", new SmsNotificationServiceImpl()),
    EMAIL("email", new EmailNotificationServiceImpl());

    private final String type;
    private final NotifactionService notifactionService;

    public static NotificationType fromType(String type) {
        for (NotificationType notificationType : NotificationType.values()) {
            if (notificationType.getType().equals(type)) {
                return notificationType;
            }
        }
        throw new IllegalArgumentException("Unknown notification type: " + type);
    }
}
