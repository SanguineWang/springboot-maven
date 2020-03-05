package com.example.springbootjpa.repository;

import com.example.springbootjpa.entity.repository.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonReporsitory extends JpaRepository <Person, Integer>{

}
