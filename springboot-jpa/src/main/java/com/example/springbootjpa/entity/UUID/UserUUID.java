package com.example.springbootjpa.entity.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class UserUUID {
    @Id
    @GeneratedValue
    @Column(length = 16)
    private UUID id;
    private String name;
    private LocalDate brithday;
    @Column(columnDefinition = "timestamp default current_timestamp", insertable = false, updatable = false)
    private LocalDate insertTime;
    @Column(columnDefinition = "timestamp default current_timestamp on update current_timestamp", insertable = false, updatable = false)
    private LocalDate updateTime;
}
