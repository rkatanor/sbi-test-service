package com.sbi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbiBankServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbiBankServiceApplication.class, args);
		/*Connection bean = run.getBean(Connection.class);
		bean.retriveData(1266);*/
	}

}

