package com.SpringBoot.SpringBoot.Config;

import com.SpringBoot.SpringBoot.enums.CarColor;
import com.SpringBoot.SpringBoot.enums.CarModel;
import com.SpringBoot.SpringBoot.models.Car;
import com.SpringBoot.SpringBoot.models.Company;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.SpringBoot.SpringBoot")

public class Config {

    @Bean(name = "car")
    @Scope("prototype")
    public Car getCar(){
        return new Car(CarModel.BMW,"M-5,F-90", CarColor.SILVER,2019,100000);
    }





}
