package Java_Basics.Projects_Creation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        int count=Integer.parseInt(scanner.nextLine());
        int hours=count*3;
        System.out.printf("The architect %s will need %d hours to complete" +
                " %d project/s",name,hours,count);
    }
}
