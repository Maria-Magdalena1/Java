package Java_OOP.ReflectionAndAnnotation.CodingTracker;

public class Main {
    @Author(name="George")
    public static void main(String[] args) throws NoSuchMethodException {
        Tracker.printMethodsByAuthor(Main.class);
    }


    @Author(name="Peter")
    private void someMethod() {

    }
}
