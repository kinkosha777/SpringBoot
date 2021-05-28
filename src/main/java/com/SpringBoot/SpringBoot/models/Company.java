package com.SpringBoot.SpringBoot.models;

import com.SpringBoot.SpringBoot.services.CarService;
import com.SpringBoot.SpringBoot.services.impl.FirstCarImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class Company {


    private CarService car;
    private Car car1;

    @Autowired
    public Company( @Qualifier ("firstCarImpl") CarService car, Car car1) {
        this.car = car;
        this.car1 = car1;
    }



    @Override
    public String toString() {
        return "Company{" +
                "car=" + car +
                '}';
    }
}
