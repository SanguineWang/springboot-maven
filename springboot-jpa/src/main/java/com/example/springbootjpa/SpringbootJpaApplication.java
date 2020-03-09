package com.example.springbootjpa;

import com.example.springbootjpa.repository.BaseReporsitory;
import com.example.springbootjpa.repository.impl.BaseReporsitoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = BaseReporsitoryImpl.class)
public class SpringbootJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaApplication.class, args);
    }

}
