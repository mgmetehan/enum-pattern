package com.mgmetehan.enumpattern.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationDto {
    private String to;
    private String body;
    private String notificationType;
}
