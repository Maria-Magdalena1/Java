package Java_OOP.ReflectionAndAnnotation.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner=new Scanner(System.in);
        Class<Reflection> reflectionClass = Reflection.class;
        //Class<Reflection> reflectionClass= (Class<Reflection>) Class.forName("Reflection");
        System.out.println(reflectionClass);

        //class type
        System.out.println(reflectionClass.getSimpleName());

        //super class type
        System.out.println(reflectionClass.getSuperclass());

        //all interfaces
        Class<?>[]interfaces=reflectionClass.getInterfaces();
        for (Class<?> anInterface:interfaces) {
            System.out.println(anInterface.getSimpleName());
        }

        //instantiate object using reflection and print it
        Constructor<Reflection> declaredConstrictor=reflectionClass.getDeclaredConstructor();
        declaredConstrictor.setAccessible(true);
        Reflection reflection=declaredConstrictor.newInstance();
        System.out.println(reflection);
    }
}
