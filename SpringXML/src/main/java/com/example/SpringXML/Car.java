package com.example.SpringXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private  Engine engine;

    public Car(){}

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public void drive(){
        engine.start();
        System.out.println("Car is driving...");
    }
}
