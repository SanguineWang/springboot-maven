package com.example.springbootjpa.repository;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseReporsitory<T, ID> extends JpaRepository<T, ID> {
    void refresh(T t);
}
