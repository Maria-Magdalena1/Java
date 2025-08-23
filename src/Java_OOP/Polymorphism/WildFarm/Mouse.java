package Java_OOP.Polymorphism.WildFarm;

public class Mouse extends Mammal{
    public Mouse(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
           this.setFoodEaten(this.getFoodEaten()+food.getQuantity());
        } else {
            System.out.println("Mice are not eating that type of food!");
        }
    }
}
