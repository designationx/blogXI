package com.xi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.xi.mapper")
@EnableEurekaClient
@SpringBootApplication
public class BlogDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogDataApplication.class, args);
	}

}
