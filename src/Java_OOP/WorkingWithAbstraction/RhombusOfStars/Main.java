package Java_OOP.WorkingWithAbstraction.RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int stars = 1; stars <=n; stars++) {
            printRow(n,stars);
        }
        for (int starsCount=n-1;starsCount>=1;starsCount--) {
            printRow(n,starsCount);
        }
    }

    public static void printRow(int n, int starCount) {
        for (int i=0;i<n-starCount;i++) {
            System.out.print(" ");
        }
        for (int col=1;col<starCount;col++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
