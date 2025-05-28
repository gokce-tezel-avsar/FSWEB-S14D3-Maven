package org.example.arge;

import org.example.company.Car;

public class CarSkeleton {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton(){

    }
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine(){
        return name;
    }
    public String drive(){
       return runEngine();
    }

    protected String runEngine(){
        return name;
    }
}
