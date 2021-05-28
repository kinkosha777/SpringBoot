package com.SpringBoot.SpringBoot;

import com.SpringBoot.SpringBoot.Config.Config;
import com.SpringBoot.SpringBoot.models.Car;
import com.SpringBoot.SpringBoot.models.Company;
import com.SpringBoot.SpringBoot.services.CarService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Car car = context.getBean("car",Car.class);
		System.out.println(car);

		Company company = context.getBean("company", Company.class);
		System.out.println(company);




	}

}
