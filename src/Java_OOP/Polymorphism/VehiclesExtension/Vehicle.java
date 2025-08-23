package Java_OOP.Polymorphism.VehiclesExtension;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String drive(double distance) {
        double neededFuel=distance*fuelConsumption;
        if (neededFuel>fuelQuantity) {
            return String.format("%s needs refueling",this.getClass().getSimpleName());
        }
        this.fuelQuantity=this.fuelQuantity-neededFuel;
        DecimalFormat decimalFormat=new DecimalFormat("##.##");
        return String.format("%s travelled %s km",this.getClass().getSimpleName(),decimalFormat.format(distance));
    }

    public void refuel(double liters) {
        if (liters<=0) {
            System.out.println("Fuel must be a positive number");
            return;
        } else if (this.getFuelQuantity()+liters>this.getTankCapacity()){
            System.out.println("Cannot fit fuel in tank");
            return;
        }

        this.setFuelQuantity(this.getFuelQuantity()+liters);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(),this.fuelQuantity);
    }
}
