package com.SpringBoot.SpringBoot.services;

import com.SpringBoot.SpringBoot.models.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public interface CarService {

    Car CreateNewCar();
}
