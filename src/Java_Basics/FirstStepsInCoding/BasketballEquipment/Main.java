package Java_Basics.FirstStepsInCoding.BasketballEquipment;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int annualFee=Integer.parseInt(scanner.nextLine());
        double shoes=annualFee-(annualFee*0.40);
        double clothes=shoes-(shoes*0.20);
        double ball=clothes/4;
        double accessories=ball/5;

        double total=annualFee+shoes+clothes+ball+accessories;
        System.out.println(total);
    }
}
