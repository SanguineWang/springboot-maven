package com.example.springbootjpa.respository;

import com.example.springbootjpa.entity.Phone;
import com.example.springbootjpa.repository.PhoneReporsitory;
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
public class PhoneRepositoryTest {
    @Autowired
    private PhoneReporsitory phoneReporsitory;

    @Test
    @DisplayName("测试持久化")
    public void test_addPerson() {
        Phone phone = new Phone();
        phone.setName("小米");
        phoneReporsitory.save(phone);

        Phone phone2 = new Phone();
        phone2.setName("华为");
        phoneReporsitory.save(phone2);
        log.debug("测试事务范围");
    }
    @Test
    @DisplayName("测试扩充jpa接口")
    public void test_jpa(){
        Phone phone2 = new Phone();
        phone2.setName("oppo");
        phoneReporsitory.save(phone2);
        phone2.setName("一加");
        phoneReporsitory.refresh(phone2);
        log.debug("{} {}" ,phone2.getName(),phone2.getInserttime());
    }
    @Test
    @DisplayName("测试findById")
    public void test_findPerson(){
        Phone phone = phoneReporsitory.findById(1).orElse(null);
        log.debug("{}",phone.getName());
    }
    @Test
    @DisplayName("测试findAll")
    public  void  testfindAll(){
        List<Phone> phone= phoneReporsitory.findAll();
        log.debug("{}",phone);
    }
}
