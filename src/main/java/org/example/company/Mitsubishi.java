package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders,name);
    }
    @Override
    public void startEngine(){
        System.out.println("the"+ getClass().getSimpleName() +"'s engine is starting");
    }
    @Override
    public void accelerate(){
        System.out.println("the "+ getClass().getSimpleName() +" is accelerating");
    }
    @Override
    public void brake(){
        System.out.println("the"+ getClass().getSimpleName() +"is braking" );
    }
}
