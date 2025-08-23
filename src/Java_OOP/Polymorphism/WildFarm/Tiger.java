package Java_OOP.Polymorphism.WildFarm;

public class Tiger extends Feline{
    public Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
           this.setFoodEaten(this.getFoodEaten()+food.getQuantity());
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }
}
