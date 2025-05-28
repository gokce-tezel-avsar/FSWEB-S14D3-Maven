package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
   private double avgKMPerLitre;
   private int cylinders;

    public double getAvgKMPerLitre() {
        return avgKMPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public GasPoweredCar(String name, String description, double avgKMPerLitre, int cylinders) {
        super(name, description);
        this.avgKMPerLitre = avgKMPerLitre;
        this.cylinders = cylinders;
    }
}
