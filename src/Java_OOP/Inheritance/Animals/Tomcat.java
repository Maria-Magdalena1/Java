package Java_OOP.Inheritance.Animals;

public class Tomcat extends Cat{
    private static final String SOUND="MEOW";
    private static final String GENDER="Male";
    public Tomcat(String name, int age, String gender) {
        super(name, age,GENDER);
    }

    @Override
    public String produceSound() {
        return SOUND;
    }
}
