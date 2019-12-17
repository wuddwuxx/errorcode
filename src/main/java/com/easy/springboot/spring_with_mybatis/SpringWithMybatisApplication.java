package com.easy.springboot.spring_with_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
@MapperScan("com.easy.springboot.spring_with_mybatis.mapper")
public class SpringWithMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithMybatisApplication.class, args);
	}

}
