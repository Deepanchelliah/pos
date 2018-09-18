package com.ctrl.cfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.ctrl.domains")
@EnableJpaRepositories("com.ctrl.dao")
@ComponentScan({"com.ctrl.resources","com.ctrl.serviceImpl","com.ctrl.service"})
public class PosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosApplication.class, args);
	}
}
