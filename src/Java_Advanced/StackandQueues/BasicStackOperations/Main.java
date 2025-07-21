package Java_Advanced.StackandQueues.BasicStackOperations;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*int [] input= Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n=input[0];
        int s=input[1];
        int x=input[2];
        */
        int n=scanner.nextInt();
        int s=scanner.nextInt();
        int x=scanner.nextInt();
        ArrayDeque<Integer> numbersStack=new ArrayDeque<>();
        /*int [] numbers=Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int num:numbers) {
            numbersStack.push(num);
        }*/
        for (int i=1;i<=n;i++) {
            numbersStack.push(scanner.nextInt());
        }

        for (int i=0;i<s;i++) {
            numbersStack.pop();
        }

        if (numbersStack.contains(x)) {
            System.out.println(true);
        } else if (numbersStack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(numbersStack));
        }

    }
}
