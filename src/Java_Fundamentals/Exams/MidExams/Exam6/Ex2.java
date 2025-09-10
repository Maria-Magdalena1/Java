package Java_Fundamentals.Exams.MidExams.Exam6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> treasures = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Yohoho!")) {
            String[] parts = input.split(" ");
            String command = parts[0];

            switch (command) {
                case "Loot":
                    for (int i = 1; i < parts.length; i++) {
                        String item = parts[i];
                        if (!treasures.contains(item)) {
                            treasures.add(0, item);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(parts[1]);
                    if (index >= 0 && index < treasures.size()) {
                        String item = treasures.get(index);
                        treasures.remove(index);
                        treasures.add(item);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(parts[1]);

                    int start = Math.max(treasures.size() - count, 0);
                    List<String> stolen = new ArrayList<>(treasures.subList(start, treasures.size()));
                    treasures.subList(start, treasures.size()).clear();
                    System.out.println(String.join(", ", stolen));
                    break;
            }
            input = scanner.nextLine();
        }

        if (treasures.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double sum = 0;
            for (String treasure:treasures) {
                sum +=treasure.length();
            }
            double average=sum/treasures.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.",average);
        }
    }
}
