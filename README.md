# springboot Course
## 基于maven创建项目
#### 1. 创建README.md文件
#### 2. 版本控制文件 .gitignore文件
#### 3. 启动版本控制 vcs
#### 4. 创建springboot 项目的 Module
#### 5. 添加maven依赖
```
<!-- bug?? 运行测试时IDEA缺少junit-platform-launcher，必须显示声明依赖 -->
        <dependency>
            <groupId>org.junit.platform</groupId>
            <artifactId>junit-platform-launcher</artifactId>
            <scope>test</scope>
        </dependency>
```
#### 6. 为application.properties 添加初始化配置
````
logging.level.root=warn
logging.level.com.example=debug
# 时间；日志级别；类；方法；行(行不能使用圆括号)
logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} %-5level %C.%M[%line] - %msg%n
````