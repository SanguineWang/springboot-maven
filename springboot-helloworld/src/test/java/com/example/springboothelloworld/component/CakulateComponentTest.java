package com.example.springboothelloworld.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CakulateComponentTest {
    @Autowired
    private CakulateComponent cakulateComponent;
    @Test
    @DisplayName("测试组件加法")
    public void test_add(){
         Assertions.assertEquals(14,cakulateComponent.add(12 ,2));
    }
}
