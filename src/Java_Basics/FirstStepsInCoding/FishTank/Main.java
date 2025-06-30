package Java_Basics.FirstStepsInCoding.FishTank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int length=Integer.parseInt(scanner.nextLine());
        int width=Integer.parseInt(scanner.nextLine());
        int height=Integer.parseInt(scanner.nextLine());
        double percentage=Double.parseDouble(scanner.nextLine());

        double volumeIncm=length*width*height;
        double volumeLiters=volumeIncm*0.001;
        double requiredLiters=volumeLiters-volumeLiters*(percentage/100);
        System.out.println(requiredLiters);
    }
}
