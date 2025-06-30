package Java_Basics.FirstStepsInCoding.SuppliesForSchool;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int packageOfPens=Integer.parseInt(scanner.nextLine());
        int packageOfMarkers=Integer.parseInt(scanner.nextLine());
        int detergent=Integer.parseInt(scanner.nextLine());
        int discountPercentage=Integer.parseInt(scanner.nextLine());
        double sum=packageOfPens*5.80 +packageOfMarkers*7.20 +detergent*1.20;
        double total=sum-(sum*(discountPercentage/100.0));
        System.out.println(total);
    }
}
