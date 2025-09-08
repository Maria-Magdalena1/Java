package Java_Fundamentals.Exams.MidExams.Exam2;

import java.util.*;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = sum * 1.0 / numbers.size();
        int count = 0;
        List<Integer> newList = new ArrayList<>();
        for (int num : numbers) {
            if (num > average) {
                newList.add(num);
            }
        }

        Collections.sort(newList);
        Collections.reverse(newList);
        if (newList.isEmpty()) {
            System.out.println("No");
        } else if (newList.size() >=5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(newList.get(i) + " ");
            }
        } else {
            for (int num:newList) {
                System.out.print(num+" ");
            }
        }
    }
}
