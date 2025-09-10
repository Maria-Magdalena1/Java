package Java_Fundamentals.Exams.MidExams.Exam5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String[] parts = input.split(" - ");
            String command = parts[0];

            if (command.equals("Collect")) {
                String item = parts[1];
                if (items.contains(item)) {
                    input = scanner.nextLine();
                    continue;
                }

                items.add(item);

            } else if (command.equals("Drop")) {
                String item = parts[1];

                items.remove(item);

            } else if (command.equals("Combine Items")) {
                String [] oldAndNewItems=parts[1].split(":");
                String oldItem = oldAndNewItems[0];
                String newItem = oldAndNewItems[1];

                if (items.contains(oldItem)) {
                    int index=items.indexOf(oldItem);
                    items.add(index+1,newItem);
                }
            } else if (command.equals("Renew")) {
                String item = parts[1];
                if (items.contains(item)) {
                    items.remove(item);
                    items.add(item);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ",items));
    }
}
