package com.example.springbootjpa.entity.repository;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * getter/setter toString
 * 实体注解
 * 无参构造函数
 */

@Data
@Entity
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(columnDefinition = "timestamp  default current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDate inserttime;


}
