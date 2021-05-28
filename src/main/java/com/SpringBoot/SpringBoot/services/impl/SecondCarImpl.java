package com.SpringBoot.SpringBoot.services.impl;

import com.SpringBoot.SpringBoot.enums.CarColor;
import com.SpringBoot.SpringBoot.enums.CarModel;
import com.SpringBoot.SpringBoot.models.Car;
import com.SpringBoot.SpringBoot.services.CarService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SecondCarImpl implements CarService {

    @Override

    public Car CreateNewCar() {
        return new Car(CarModel.MERCEDES,"S-222", CarColor.BLACK,2020,130000);
    }

    @Override
    public String toString() {
        return "CarModel=" + " " + CreateNewCar().getCarModel() +
                " " + ", carColor" + " = " + CreateNewCar().getCarColor() + ", body" + " = " + CreateNewCar().getBody() +
                ", year" + " = " + CreateNewCar().getYear() + ", price" + " = " + CreateNewCar().getPrice();
    }
}
