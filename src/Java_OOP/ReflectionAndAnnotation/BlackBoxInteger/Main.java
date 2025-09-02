package Java_OOP.ReflectionAndAnnotation.BlackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Class<BlackBoxInt> blackBoxIntClass = BlackBoxInt.class;
        Constructor<BlackBoxInt> ctor = blackBoxIntClass.getDeclaredConstructor(int.class);
        ctor.setAccessible(true);

        BlackBoxInt blackBox = ctor.newInstance(0);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String command=input.split("_")[0];
            int number=Integer.parseInt(input.split("_")[1]);

            //find method by name
            Method method=blackBoxIntClass.getDeclaredMethod(command,int.class);
            method.setAccessible(true);

            method.invoke(blackBox,number);

            //access private field innerValue
            Field field=blackBoxIntClass.getDeclaredField("innerValue");
            field.setAccessible(true);
            int result=(int)field.get(blackBox);

            System.out.println(result);
            input = scanner.nextLine();
        }
    }
}
