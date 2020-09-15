package com.example.springbootswagger;

import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class PetDto {
    private final int id;
    private final String kind;
    private final String name;
}
