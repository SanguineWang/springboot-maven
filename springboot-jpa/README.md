##JPA
    2020.02.28
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
