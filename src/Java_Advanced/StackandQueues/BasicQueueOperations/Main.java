package Java_Advanced.StackandQueues.BasicQueueOperations;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<Integer> numberQueue=new ArrayDeque<>();
        int n=scanner.nextInt();
        int s=scanner.nextInt();
        int x=scanner.nextInt();

        for (int i=0;i<n;i++) {
            numberQueue.offer(scanner.nextInt());
        }

        for (int i=0;i<s;i++) {
            numberQueue.poll();
        }

        if (numberQueue.contains(x)) {
            System.out.println(true);
        } else if (numberQueue.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(numberQueue));
        }

    }
}
