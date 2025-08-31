package Java_OOP.ReflectionAndAnnotation.GettersAndSetters;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       Class<Reflection> reflectionClass=Reflection.class;
       Method [] declaredMethods=reflectionClass.getDeclaredMethods();
        Arrays.stream(declaredMethods)
                .filter(method->method.getName().startsWith("get"))
                .forEach(method -> System.out.printf("%s will return class %s%n",
                        method.getName(),method.getReturnType().getSimpleName()));


        Arrays.stream(declaredMethods)
                .filter(method -> method.getName().startsWith("set"))
                .forEach(method -> System.out.printf("%s and will set field of class %s%n",
                        method.getName(),method.getReturnType().getSimpleName()));
    }
}
