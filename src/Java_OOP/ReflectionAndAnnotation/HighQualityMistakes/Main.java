package Java_OOP.ReflectionAndAnnotation.HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Class<Reflection> reflectionClass= Reflection.class;
        Method[] declaredMethods=reflectionClass.getDeclaredMethods();

        Field[] fields = reflectionClass.getDeclaredFields();
        Arrays.stream(fields)
                .filter(field -> !Modifier.isPublic(field.getModifiers()))
                .forEach(field -> System.out.printf("%s have to be private!%n",field.getName()));

        Arrays.stream(declaredMethods)
                .filter(method -> method.getName().startsWith("get"))
                .filter(method -> !Modifier.isPublic(method.getModifiers()))
                .forEach(method -> System.out.printf("%s have to be public!%n",method.getName()));

        Arrays.stream(declaredMethods)
                .filter(method -> method.getName().startsWith("set"))
                .filter(method -> !Modifier.isPrivate(method.getModifiers()))
                .forEach(method -> System.out.printf("%s have to be private!%n",method.getName()));

    }
}
