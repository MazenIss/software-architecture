package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    private  CarDb _carsDb;
    public CarManager(){
        this._carsDb=new CarDb();
    }

   

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb.getCars()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb.getCars()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
