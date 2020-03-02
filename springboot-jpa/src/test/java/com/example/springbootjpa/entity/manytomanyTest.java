package com.example.springbootjpa.entity;

import com.example.springbootjpa.entity.manytomany.Course;
import com.example.springbootjpa.entity.manytomany.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class manytomanyTest {
    @Autowired
    private EntityManager manager;

    @Test
    public void test_init(){
        Student student1=new Student();
        student1.setName("wang");
        manager.persist(student1);

        Student student2=new Student();
        student2.setName("zi");
        manager.persist(student2);

        Student student3=new Student();
        student3.setName("yang");
        manager.persist(student3);

        Course course1=new Course();
        course1.setName("web开发");
        manager.persist(course1);

        Course course2=new Course();
        course2.setName("web框架");
        manager.persist(course2);
    }

}
