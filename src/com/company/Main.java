package com.company;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
    Car car = new Car("BMW", "F95", "Black");
    car.checkAnnotation(car);
    }
}
