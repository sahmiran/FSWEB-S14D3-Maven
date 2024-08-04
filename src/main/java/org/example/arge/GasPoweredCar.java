package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double averageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double averageKmPerLiter, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public String drive() {
        runEngine(this);
        return "run from GasPowered car";
    }

    @Override
    public String startEngine() {
        return getName()+" car starting...";
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
}
