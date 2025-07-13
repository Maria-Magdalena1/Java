package Java_Basics.NestedLoop.CarNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());
        for (int i = first; i <= last; i++) {
            for (int j = first; j <= last; j++) {
                for (int k = first; k <= last; k++) {
                    for (int u = first; u <= last; u++) {
                        int sum = j + k;
                        if (sum % 2 == 0 && i > u) {
                            if ((i % 2 == 0 && u % 2 != 0) || (i % 2 != 0 && u % 2 == 0)) {
                                System.out.printf("%d%d%d%d ", i, j, k, u);
                            }
                        }
                    }
                }
            }
        }
    }
}
