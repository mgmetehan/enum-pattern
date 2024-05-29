package com.mgmetehan.enumpattern.type;

import com.mgmetehan.enumpattern.config.SpringContext;
import com.mgmetehan.enumpattern.service.NotifactionService;
import com.mgmetehan.enumpattern.service.impl.EmailNotificationServiceImpl;
import com.mgmetehan.enumpattern.service.impl.SmsNotificationServiceImpl;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum NotificationType {

    EMAIL(EmailNotificationServiceImpl.class),
    SMS(SmsNotificationServiceImpl.class);

    private final Class<? extends NotifactionService> serviceClass;

    public NotifactionService getService() {
        return SpringContext.getBean(serviceClass);
    }

    public static NotificationType fromType(String type) {
        return Arrays.stream(NotificationType.values())
                .filter(notificationType -> notificationType.name().equalsIgnoreCase(type))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown notification type: " + type));
    }
}
