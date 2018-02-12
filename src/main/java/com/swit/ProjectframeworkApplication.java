package com.swit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.swit.dao")
public class ProjectframeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectframeworkApplication.class, args);
	}
}
