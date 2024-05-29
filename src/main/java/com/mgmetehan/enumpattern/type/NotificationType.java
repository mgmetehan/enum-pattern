package com.mgmetehan.enumpattern.type;

import com.mgmetehan.enumpattern.config.SpringContext;
import com.mgmetehan.enumpattern.service.NotifactionService;
import com.mgmetehan.enumpattern.service.impl.EmailNotificationServiceImpl;
import com.mgmetehan.enumpattern.service.impl.SmsNotificationServiceImpl;
import lombok.Getter;

import java.util.Arrays;

@Getter
public enum NotificationType {

    EMAIL(EmailNotificationServiceImpl.class),
    SMS(SmsNotificationServiceImpl.class);

    private final Class<? extends NotifactionService> serviceClass;

    NotificationType(Class<? extends NotifactionService> serviceClass) {
        this.serviceClass = serviceClass;
    }

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
