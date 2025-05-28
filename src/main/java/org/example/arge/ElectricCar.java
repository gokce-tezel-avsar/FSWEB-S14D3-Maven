package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public ElectricCar(String name, String description, int batterySize, double avgKmPerCharge) {
        super(name, description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = avgKmPerCharge;
    }
}
