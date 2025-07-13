package Java_Fundamentals.Arrays.ReverseanArrayofStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        for (int i = 0; i < elements.length / 2; i++) {
            String current = elements[i];
            int currentindex = elements.length - 1 - i;

            elements[i] = elements[currentindex];
            elements[currentindex] = current;
        }
        String finalEl = String.join(" ", elements);
        System.out.println(finalEl);
    }
}
