package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarDb {
    private List<Car> _cars = Arrays
            .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
                    new Car("3", "Megane", "Renault"));
    List<Car> getCars(){
      return this._cars;
    }
    public Car getFromDb(final String carId) {
        for (Car car : _cars) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

}
