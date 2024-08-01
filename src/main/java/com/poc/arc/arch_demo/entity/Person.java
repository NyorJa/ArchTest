package com.poc.arc.arch_demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person")
public class Person {

    @Id
    private Long id;

    private String name;
    private String address;

    @Column(columnDefinition = "TIMESTAMP")
    @CreatedDate
    private LocalDateTime createdDateTime;
}
