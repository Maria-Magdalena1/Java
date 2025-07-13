package Java_Fundamentals.Lists.Messaging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String text = scanner.nextLine();
        List<Character> textList = new ArrayList<>();
        for (char c : text.toCharArray()) {
            textList.add(c);
        }

        String result = "";

        for (int num : numbers) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            int index = sum % textList.size();

            char selectedChar = textList.remove(index);
            result += selectedChar;
        }

        System.out.println(result);
    }
}
