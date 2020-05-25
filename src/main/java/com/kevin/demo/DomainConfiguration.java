package com.kevin.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.kevin.demo.infrastructure.repository", "com.kevin.demo.infrastructure.mapper"})
@MapperScan("com.kevin.demo.infrastructure.mapper")
public class DomainConfiguration {
}
