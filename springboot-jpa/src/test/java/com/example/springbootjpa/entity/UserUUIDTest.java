package com.example.springbootjpa.entity;

import com.example.springbootjpa.entity.UUID.UserUUID;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.LocalDate;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class UserUUIDTest {
    @Autowired
    private EntityManager manager;
    @Test
    public void test_addUser(){
        UserUUID userUUID=new UserUUID();
        userUUID.setName("wang");
        userUUID.setBrithday(LocalDate.of(2000,3,12));
        manager.persist(userUUID);
        log.debug("{}",userUUID.getId());
    }
}
