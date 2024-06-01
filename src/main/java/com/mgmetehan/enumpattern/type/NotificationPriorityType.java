package com.mgmetehan.enumpattern.type;

import com.mgmetehan.enumpattern.config.SpringContext;
import com.mgmetehan.enumpattern.service.NotificationPriorityService;
import com.mgmetehan.enumpattern.service.impl.HighNotificationPriorityServiceImpl;
import com.mgmetehan.enumpattern.service.impl.LowNotificationPriorityServiceImpl;

public enum NotificationPriorityType {

    LOW() {
        @Override
        public NotificationPriorityService execute() {
            return SpringContext.getBean(LowNotificationPriorityServiceImpl.class);
        }
    },
    HIGH() {
        @Override
        public NotificationPriorityService execute() {
            return SpringContext.getBean(HighNotificationPriorityServiceImpl.class);
        }
    };

    public abstract NotificationPriorityService execute();
}
