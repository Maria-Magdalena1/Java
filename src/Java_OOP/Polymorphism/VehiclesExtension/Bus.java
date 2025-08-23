package Java_OOP.Polymorphism.VehiclesExtension;

public class Bus extends Vehicle{
    private double emptyBusFuelConsumption;
    private double nonEmptyBusFuelConsumption;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.emptyBusFuelConsumption=fuelConsumption;
        this.nonEmptyBusFuelConsumption=fuelConsumption+1.4;
    }

    @Override
    public String drive(double distance) {
        //this.setFuelConsumption(getFuelConsumption()+1.4);
        this.setFuelConsumption(nonEmptyBusFuelConsumption);
        return super.drive(distance);
    }

    public String driveEmpty(double distance) {
        this.setFuelConsumption(emptyBusFuelConsumption);
        return super.drive(distance);
    }
}
