package com.example.springbootjpa.respository;

import com.example.springbootjpa.entity.repository.Person;
import com.example.springbootjpa.repository.PersonReporsitory;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
//回滚关闭，默认开启，生产环境测试 回滚开启
public class PersonTest {
    @Autowired
    private PersonReporsitory personReporsitory;

    @Test
    @DisplayName("测试持久化")
    public void test_addPerson() {
        Person person = new Person();
        person.setName("wang");
        personReporsitory.save(person);
        log.debug("测试事务范围");
    }

    @Test
    @DisplayName("测试findById")
    public void test_findPerson(){
        Person person = personReporsitory.findById(1).orElse(null);
        log.debug("{}",person.getName());
    }
    @Test
    @DisplayName("测试findAll")
    public  void  testfindAll(){
        List<Person> people=personReporsitory.findAll();
        log.debug("{}",people);
    }
}
