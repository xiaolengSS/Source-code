package com.sourcecode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.sourcecode.mapper"})
public class SourceCodeBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(SourceCodeBackendApplication.class,args);
    }
}
