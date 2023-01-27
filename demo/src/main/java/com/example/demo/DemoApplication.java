package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//		System.out.println("welcome to spring");
//		Alien a = new Alien();
//		a.show();
		
		ConfigurableApplicationContext context  = SpringApplication.run(DemoApplication.class, args);
		
		Alien a  = context.getBean(Alien.class);  //  it only access those class which has @component included
		a.show();
		
	}

}
