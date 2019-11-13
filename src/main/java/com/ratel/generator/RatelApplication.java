package com.ratel.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ratel.generator.dao")
public class RatelApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatelApplication.class, args);
		System.out.println("启动成功");
	}
}
