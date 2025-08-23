package Java_OOP.Polymorphism.Vehicles;

public class Truck extends Vehicle{
    private final static double ADDITIONAL_AC=1.6;
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.setFuelConsumption(this.getFuelConsumption()+ADDITIONAL_AC);
    }

    @Override
    public void refuel(double liters) {
        liters=liters*0.95;
        super.refuel(liters);
    }
}
