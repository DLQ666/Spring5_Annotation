package com.dlq.bean;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-24 15:43
 */
public class Color {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }
}
