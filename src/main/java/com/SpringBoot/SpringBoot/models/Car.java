package com.SpringBoot.SpringBoot.models;

import com.SpringBoot.SpringBoot.enums.CarColor;
import com.SpringBoot.SpringBoot.enums.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;


public class Car {
    private CarModel carModel;
    private String body;
    private CarColor carColor;
    private int year;
    private int price;

    public Car() {
    }

    @Autowired
    public Car(CarModel carModel, String body, CarColor carColor, int year, int price) {
        this.carModel = carModel;
        this.body = body;
        this.carColor = carColor;
        this.year = year;
        this.price = price;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel=" + carModel +
                ", body='" + body + '\'' +
                ", carColor=" + carColor +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
