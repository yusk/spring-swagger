package com.example.springbootswagger;

import lombok.Value;

@Value
public class ErrorDto {
    private final String code;
    private final String message;
    private final String status;
}
