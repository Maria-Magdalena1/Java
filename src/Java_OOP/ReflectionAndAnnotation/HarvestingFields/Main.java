package Java_OOP.ReflectionAndAnnotation.HarvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //Class<RichSoilLand> richSoilLandClass=RichSoilLand.class;
        //Field[] fields=richSoilLandClass.getDeclaredFields();
        Field [] fields=RichSoilLand.class.getDeclaredFields();

        while (!input.equals("Harvest")) {
            if (input.equals("private")) {
                for (Field field : fields) {
                    if (Modifier.isPrivate(field.getModifiers())) {
                        printField(field);
                    }
                }
            } else if (input.equals("protected")) {
                for (Field field : fields) {
                    if (Modifier.isProtected(field.getModifiers())) {
                        printField(field);
                    }
                }
            } else if (input.equals("public")) {
                for (Field field : fields) {
                    if (Modifier.isPublic(field.getModifiers())) {
                        printField(field);
                    }
                }
            } else if (input.equals("all")) {
                for (Field field : fields) {
                    printField(field);
                }
            }
            input = scanner.nextLine();
        }
    }

    private static void printField(Field field) {
        String modifier=Modifier.toString(field.getModifiers());
        String type=field.getType().getSimpleName();
        String name=field.getName();
        System.out.printf("%s %s %s%n", modifier, type, name);
    }
}
