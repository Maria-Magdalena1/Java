package Java_Basics.FirstStepsInCoding.HousePainting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x=Double.parseDouble(scanner.nextLine());
        double y=Double.parseDouble(scanner.nextLine());
        double h=Double.parseDouble(scanner.nextLine());

        double green=x*x+(x*x-2*1.2)+2*(x*y-1.5*1.5);
        double greenInLiters=green/3.4;

        double red=2*x*y+2*(x*h/2);
        double redInLiters=red/4.3;

        System.out.printf("%.2f/n",greenInLiters);
        System.out.printf("%.2f",redInLiters);
    }
}
