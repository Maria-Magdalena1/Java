package Java_Basics.Exams.Exam7;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String actorsName=scanner.nextLine();
        double points=Double.parseDouble(scanner.nextLine());
        int jury=Integer.parseInt(scanner.nextLine());
        for (int i=0;i<jury;i++) {
            String juryName=scanner.nextLine();
            double juryPoints=Double.parseDouble(scanner.nextLine());

            points+=juryName.length()*juryPoints/2;
            if (points>1250.5) {
                break;
            }
        }
        if (points>1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, points);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!",actorsName,1250.5-points);
        }
    }
}
