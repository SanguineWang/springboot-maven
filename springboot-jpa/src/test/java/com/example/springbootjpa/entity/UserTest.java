package com.example.springbootjpa.entity;

import com.example.springbootjpa.entity.onetomany.Address;
import com.example.springbootjpa.entity.onetomany.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class UserTest {
    @Autowired
    private EntityManager manager;

    @Test
    public void test_relation() {
        User user = new User();
        user.setName("ziyang");
        manager.persist(user);

        Address address1 = new Address();
        address1.setAddress("101");
        manager.persist(address1);

        Address address2 = new Address();
        address2.setAddress("102");
        manager.persist(address2);
    }
    @Test
    @DisplayName("测试从关系维护端建立关系")
    public  void test_relation2(){
        User user= manager.find(User.class,1);//主键为1
        Address address1=manager.find(Address.class,1);
        address1.setUser(user);
        Address address2=manager.find(Address.class,2);
        address2.setUser(user);
    }
    @Test
    @DisplayName("测试从关系被维护端建立关系")
    public  void test_relation3(){
        User user= manager.find(User.class,1);//主键为1
        Address address1=manager.find(Address.class,1);
        Address address2=manager.find(Address.class,2);
        user.setAddressList(List.of(address1,address2));
    }

}
