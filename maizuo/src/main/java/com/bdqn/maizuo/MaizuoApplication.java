package com.bdqn.maizuo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.bdqn.maizuo"})
@MapperScan("com.bdqn.maizuo.dao")
public class MaizuoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaizuoApplication.class, args);

	}


}
