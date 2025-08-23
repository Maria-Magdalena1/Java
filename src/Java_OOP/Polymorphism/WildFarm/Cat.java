package Java_OOP.Polymorphism.WildFarm;

import java.text.DecimalFormat;

public class Cat extends Feline{
    private String breed;
    public Cat(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion,String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed=breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
       this.setFoodEaten(this.getFoodEaten()+food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.##");
        return String.format("%s[%s, %s, %s, %s, %d]",
                this.getClass().getSimpleName(),
                super.getAnimalName(),
                this.breed,
                df.format(super.getAnimalWeight()),
                super.getLivingRegion(),
                super.getFoodEaten());
    }
}
