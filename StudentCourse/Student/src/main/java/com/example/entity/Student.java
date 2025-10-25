package com.example.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString

public class Student {
    private Integer id;
    private String name;
    private String course;
}
