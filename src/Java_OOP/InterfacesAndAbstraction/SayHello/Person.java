package Java_OOP.InterfacesAndAbstraction.SayHello;

public interface Person {
    String getName();
    default String sayHello(){
        return "Hello";
    }
}
