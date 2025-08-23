package Java_OOP.Polymorphism.Vehicles;

public class Car extends Vehicle{
    private final static double ADDITIONAL_AC=0.9;
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.setFuelConsumption(this.getFuelConsumption()+ADDITIONAL_AC);
    }
}
