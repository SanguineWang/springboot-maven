package com.example.springboothelloworld.repository;

import com.example.springboothelloworld.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
//回滚关闭，默认开启，生产环境测试 回滚开启
public class BookReporsitoryTest {
   @Autowired
    private BookReporsitory bookReporsitory;

   @Test
    @DisplayName("添加book")
    public void test_addBook() {
       Book book1 = new Book();
       book1.setName("web框架");
       bookReporsitory.save(book1);
       Book book2 = new Book();
       book2.setName("web开发");
       bookReporsitory.save(book2);
        log.debug("测试事务范围");
    }
    @Test
    @DisplayName("测试findAll")
    public  void  testfindAll(){
        List<Book> people=bookReporsitory.findAll();
        log.debug("{}",people);
    }
}