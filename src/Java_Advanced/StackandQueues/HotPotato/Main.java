package Java_Advanced.StackandQueues.HotPotato;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] names=scanner.nextLine().split("\\s+");
        ArrayDeque<String> kidsQueue=new ArrayDeque<>();
        int n=Integer.parseInt(scanner.nextLine());
        //Collections.addAll(kidsQueue,names);
        for (String name:names) {
            kidsQueue.offer(name);
        }
        int rotation=0;
        while (kidsQueue.size()>1) {
          String firstKid=kidsQueue.poll();
          rotation++;
          if (rotation%n==0) {
              System.out.printf("Removed %s\n",firstKid);
          } else {
              kidsQueue.offer(firstKid);
          }
        }
        System.out.println("Last is "+kidsQueue.poll());
    }
}
