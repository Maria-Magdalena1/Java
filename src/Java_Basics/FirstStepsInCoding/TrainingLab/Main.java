package Java_Basics.FirstStepsInCoding.TrainingLab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double l=Double.parseDouble(scanner.nextLine());
        double w=Double.parseDouble(scanner.nextLine());
        int width=(int)((w-1)/0.7);
        int length=(int)((l/1.2));
        int mesta=(width*length)-3;
        System.out.println(mesta);
    }
}
