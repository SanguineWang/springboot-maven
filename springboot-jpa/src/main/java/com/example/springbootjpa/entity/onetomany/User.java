package com.example.springbootjpa.entity.onetomany;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String brithday;

    //与对面多对一关系声明的属性名一致
    @OneToMany(mappedBy = "user")
    private List<Address> addressList;
}
