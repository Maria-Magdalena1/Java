package Java_Fundamentals.Exams.MidExams.Exam4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String command = input.split(" ")[0];
            if (command.equals("Urgent")) {
                String item = input.split(" ")[1];
                if (products.contains(item)) {
                    input = scanner.nextLine();
                    continue;
                }
                products.set(0, item);
            } else if (command.equals("Unnecessary")) {
                String item = input.split(" ")[1];
                if (products.contains(item)) {
                    input=scanner.nextLine();
                    continue;
                }
                products.remove(item);
            } else if (command.equals("Correct")) {
                String oldItem = input.split(" ")[1];
                String newItem = input.split(" ")[2];
                if (!products.contains(oldItem)) {
                    input=scanner.nextLine();
                    continue;
                }
                int index=products.indexOf(oldItem);
                if (index!=-1) {
                    products.set(index,newItem);
                }
            } else if (command.equals("Rearrange")) {
                String item = input.split(" ")[1];
                if (!products.contains(item)) {
                    input=scanner.nextLine();
                    continue;
                }
                products.remove(item);
                products.add(item);
            }
            input = scanner.nextLine();
        }

        System.out.println(String.join(", ",products));
    }
}
