## JPA
    2020.02.29
    基本基于Springboot的spring-data-jpa项目
    基本JPA实体类注解
#### 添加application.properties 
````
########## datasource ##########
spring.datasource.url=jdbc:mysql://localhost:3306/jpatest?createDatabaseIfNotExist=true\
  &serverTimezone=Asia/Shanghai
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver

########## jpa ##########
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

########## log ##########
logging.level.root=warn
logging.level.com.example=debug
logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} %-5level %C.%M[%line] - %msg%n
# 时间；日志级别；类；方法；行(行不能使用圆括号)
````
### JPA-Entity注解
* 类头注解
````
@Data  
#自动getter/setter tostring（）

@NoArgsConstructor
#自动生成无参构造函数

@Entity
#标明实体类
````
* 属性注解
````
@id
#主键

@GeneratedValue 
#自增长

@Column(length = 16)
@Column(columnDefinition = "timestamp default current_timestamp on update current_timestamp", insertable = false, updatable = false)
#对列的事务控制
````
### EntityTest注解
* 类头注解
````
@SpringBootTest
#springboot的测试注解
@Slf4j
#自动实例化log
@Transactional
#事务操作
@Rollback(value = false)
#回滚 测试类中默认删除操作，学习过程中关闭

````
* 属性注解
````
@Autowired
private EntityManager manager;
#注入实体管理器 可调用 persist插入实体到数据库
````
