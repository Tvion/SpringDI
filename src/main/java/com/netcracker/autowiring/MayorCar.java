package com.netcracker.autowiring;

public class MayorCar {
    private Car car;

    public MayorCar(){

    }


    public MayorCar(Car carCons) {
        this.car = carCons;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
