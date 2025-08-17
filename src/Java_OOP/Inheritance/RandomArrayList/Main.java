package Java_OOP.Inheritance.RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<String> names = new RandomArrayList<String>();
        names.add("Kaloyan");
        names.add("Mari");
        names.add("Vivi");
        System.out.println(names.getRandomElement());

    }
}
