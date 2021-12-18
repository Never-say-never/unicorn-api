package com.example.demo.unicorn;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UnicornDto {
    private String name;

    public static UnicornDto of(Unicorn unicorn) {
        return UnicornDto.builder()
                .name(unicorn.getName())
                .build();
    }
}
