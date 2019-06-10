package com.amar.smples.messaging.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppMessage {
    private final String id, message;
}
