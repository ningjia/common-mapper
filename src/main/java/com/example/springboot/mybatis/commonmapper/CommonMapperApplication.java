package com.example.springboot.mybatis.commonmapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.springboot.mybatis.commonmapper.mapper") //指定要扫描的Mapper类的包的路径
public class CommonMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonMapperApplication.class, args);
	}
}
