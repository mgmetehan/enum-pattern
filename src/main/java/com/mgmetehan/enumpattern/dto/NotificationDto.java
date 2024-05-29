package com.mgmetehan.enumpattern.dto;

import com.mgmetehan.enumpattern.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationDto {
    private String to;
    private String body;
    private String notificationType;

    public User toUser(NotificationDto dto) {
        return User.builder()
                .username(dto.getTo())
                .build();
    }
}
