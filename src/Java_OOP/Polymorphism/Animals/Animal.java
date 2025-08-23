package Java_OOP.Polymorphism.Animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    abstract String explainSelf();
    //public String explainSelf(){
    //    return String.format("I am %s and my favourite food is %s",this.getName(),this.getFavouriteFood());
    //}
}
