package com.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.java.mapper")
public class SpringbootstartprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootstartprojectApplication.class, args);
    }

}
