package com.springboot.test.test.Domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Student {
    @Id
    private Integer id;
    private String name;
    private String address;
    private String grade;


}
