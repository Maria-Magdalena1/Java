package Java_Advanced.StackandQueues.MathPotato;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        PriorityQueue<String> kidsQueue = new PriorityQueue<>();
        for (String name : names) {
            kidsQueue.offer(name);
        }
        int cycle = 1;
        while (kidsQueue.size() > 1) {
            String currentKid = kidsQueue.poll();

            if (isPrime(cycle)) {
                System.out.println("Prime " +currentKid);
                kidsQueue.offer(currentKid);

            } else {
                System.out.println("Removed "+currentKid);
            }
            cycle++;


        }
        System.out.println("Last is "+kidsQueue.peek());
    }

    public static boolean isPrime(int cycle) {
        if (cycle < 2) {
            return false;
        }
        for (int i = 2; i <= cycle / 2; i++) {
            if (cycle % i == 0) {
               return false;
            }
        }
        return true;
    }
}
