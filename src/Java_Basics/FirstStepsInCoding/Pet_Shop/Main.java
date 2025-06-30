package Java_Basics.FirstStepsInCoding.Pet_Shop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int dog_count_package=Integer.parseInt(scanner.nextLine());
        int cat_count_package=Integer.parseInt(scanner.nextLine());
        double total=dog_count_package*2.50 +cat_count_package*4;
        System.out.printf("%.1f lv.",total);
    }
}
