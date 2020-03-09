## spring-web
```java
@Controller 
//可以返回页面文件
@RestController
//返回JSON，XML或自定义mediaType内容到页面
//相当于 @ResponseBody ＋ @Controller
//但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面
```
## 跨域访问

#### 编写配置类
```java
@Configuration
public class CrossConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("GET","POST","HEAD")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
```
