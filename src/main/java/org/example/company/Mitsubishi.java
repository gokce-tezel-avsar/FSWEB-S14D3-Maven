package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders,name);
    }
    @Override
    public String startEngine(){
        String engineStart =  "the car's engine is starting";
        System.out.println(getClass().getSimpleName());
        return engineStart;

    }
    @Override
    public String accelerate(){
        String engineAccelerate =  "the car is accelerating";
        System.out.println(getClass().getSimpleName());
        return engineAccelerate;
    }
    @Override
    public String brake() {
        String carBrake = "the car is braking";
        System.out.println(getClass().getSimpleName());
        return carBrake;
    }
}
