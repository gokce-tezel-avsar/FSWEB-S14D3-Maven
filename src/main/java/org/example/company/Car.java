package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    public String startEngine(){
        String engineStart =  "the car's engine is starting";
        System.out.println(getClass().getSimpleName());
        return engineStart;

    }
    public String accelerate(){
        String engineAccelerate =  "the car is accelerating";
        System.out.println(getClass().getSimpleName());
        return engineAccelerate;
    }
    public String brake(){
        String carBrake = "the car is braking";
        System.out.println(getClass().getSimpleName());
        return carBrake;
    }

}
