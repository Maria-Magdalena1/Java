package Java_OOP.Inheritance.Animals;

public class Kittens extends Cat{
    private static final String SOUND="Meow";

    private final static String GENDER="Female";
    public Kittens(String name, int age, String gender) {
        super(name, age,GENDER);
    }

    @Override
    public String produceSound() {
        return SOUND;
    }
}
