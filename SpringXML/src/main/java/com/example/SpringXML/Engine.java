package com.example.SpringXML;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String type;

    public Engine(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void start(){
        System.out.println("Engine started!!");
    }
}
