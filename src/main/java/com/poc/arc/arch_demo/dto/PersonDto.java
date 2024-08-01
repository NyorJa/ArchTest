package com.poc.arc.arch_demo.dto;

import java.time.LocalDateTime;

public record PersonDto(String name, String address, LocalDateTime createdDateTime) {
}
