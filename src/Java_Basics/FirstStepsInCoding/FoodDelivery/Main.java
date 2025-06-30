package Java_Basics.FirstStepsInCoding.FoodDelivery;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int chickenMenus=Integer.parseInt(scanner.nextLine());
        int fishMenus=Integer.parseInt(scanner.nextLine());
        int vegetarianMenus=Integer.parseInt(scanner.nextLine());

        double sum=chickenMenus*10.35 +fishMenus*12.40 +vegetarianMenus*8.15;
        double dessert=sum*0.20;
        double total=sum+dessert+2.50;
        System.out.printf("%.1f",total);
    }
}
