package Java_Basics.FirstStepsInCoding.Repainting;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nylon=Integer.parseInt(scanner.nextLine());
        int litersPaint=Integer.parseInt(scanner.nextLine());
        int thinner=Integer.parseInt(scanner.nextLine());
        int hours=Integer.parseInt(scanner.nextLine());

        double sumNylon=(nylon+2)*1.50;
        double sumLitersOfPaint=(litersPaint+litersPaint*0.10)*14.50;
        double sumThinner=thinner*5.0;

        double expensesForMaterials=sumNylon+sumLitersOfPaint+sumThinner+0.40;
        double salaryForWorkers=(expensesForMaterials*0.30)*hours;

        double total=expensesForMaterials+salaryForWorkers;
        System.out.println(total);



    }
}
