package com.example.springbootjpa.entity.manytomany;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Elective {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String extra;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Student student;
}
