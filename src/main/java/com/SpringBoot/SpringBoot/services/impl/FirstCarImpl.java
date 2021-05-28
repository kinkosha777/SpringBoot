package com.SpringBoot.SpringBoot.services.impl;

import com.SpringBoot.SpringBoot.enums.CarColor;
import com.SpringBoot.SpringBoot.enums.CarModel;
import com.SpringBoot.SpringBoot.models.Car;
import com.SpringBoot.SpringBoot.services.CarService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class FirstCarImpl implements CarService {

    @Override
    @Primary
    public Car CreateNewCar() {
        return new Car(CarModel.LEXUS,"LX-570", CarColor.WHITE,2019,83000);
    }

    @Override
    public String toString() {
        return "CarModel=" + " " + CreateNewCar().getCarModel() +
                " " + ", carColor" + " = " + CreateNewCar().getCarColor() + ", body" + " = " + CreateNewCar().getBody() +
                ", year" + " = " + CreateNewCar().getYear() + ", price" + " = " + CreateNewCar().getPrice();
    }
}
