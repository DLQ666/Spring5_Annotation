package com.dlq.bean;

import org.springframework.stereotype.Component;

@Component
public class Car {

    public Car(){
        System.out.println("car constroctor...");
    }

    public void init(){
        System.out.println("car ... init...");
    }

    public void destory(){
        System.out.println("car ... destory ...");
    }
}
