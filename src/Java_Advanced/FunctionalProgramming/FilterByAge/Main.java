package Java_Advanced.FunctionalProgramming.FilterByAge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,Integer> nameAge=new LinkedHashMap<>();
        for (int i=0;i<n;i++) {
            String input=scanner.nextLine();
            String name=input.split(", ")[0];
            int age= Integer.parseInt(input.split(", ")[1]);
            nameAge.put(name,age);
        }

        String condition=scanner.nextLine();
        int requiredAge=Integer.parseInt(scanner.nextLine());
        String format=scanner.nextLine();
       Predicate<Integer> tester=createTester(condition,requiredAge);
        Consumer<Map.Entry<String,Integer>> printer=createPrinter(format);
        printFilteredStudent(nameAge,tester,printer);
    }

    private static void printFilteredStudent(Map<String, Integer> nameAge, Predicate<Integer> tester, Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String,Integer> person:nameAge.entrySet()) {
            if (tester.test(nameAge.get(person.getKey()))) {
                printer.accept(person);
            }
        }
    }

    private static Consumer<Map.Entry<String, Integer>> createPrinter(String format) {
        Consumer<Map.Entry<String,Integer>> printer=null;
        switch (format) {
            case "name age":
                printer=person-> System.out.printf("%s - %d%n",
                        person.getKey(),person.getValue());
                break;
            case "age":
                printer=person-> System.out.println(person.getValue());
                break;
            case "name":
                printer=person-> System.out.println(person.getKey());
                break;
        }
        return printer;
    }

    static Predicate<Integer> createTester(String condition,Integer age) {
        Predicate<Integer> tester=null;
        switch (condition) {
            case "younger":
                tester=x->x<=age;
                break;
            case "older":
                tester=x->x>=age;
                break;
        }
        return tester;
    }
}
