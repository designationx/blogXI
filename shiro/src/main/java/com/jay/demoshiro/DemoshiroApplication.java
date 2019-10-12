package com.jay.demoshiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan
@MapperScan(basePackages = {"com.jay.demoshiro.mapper"}) //告诉容器扫描那个包下的Mapper
public class DemoshiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoshiroApplication.class, args);
	}
}
