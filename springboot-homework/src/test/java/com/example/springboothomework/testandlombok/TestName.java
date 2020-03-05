package com.example.springboothomework.testandlombok;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class TestName {

    public void get(String name) {
        int length = 5;
        if (name.length() <= length) {
          log.debug("输入{}，长度小于{}",name,length);
        }
    }


}
