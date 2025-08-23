package Java_OOP.Polymorphism.WildFarm;

public abstract class Feline extends Mammal{
    public Feline(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void eat(Food food) {
        this.setFoodEaten(this.getFoodEaten()+food.getQuantity());
    }
}
