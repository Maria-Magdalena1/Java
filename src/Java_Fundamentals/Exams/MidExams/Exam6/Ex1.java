package Java_Fundamentals.Exams.MidExams.Exam6;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int days=Integer.parseInt(scanner.nextLine());
        int dailyPlunder=Integer.parseInt(scanner.nextLine());
        double expectedPlunder=Double.parseDouble(scanner.nextLine());

        double total=0;
        for (int i=1;i<=days;i++) {
            total+=dailyPlunder;
            if (i%3==0) {
                total+=dailyPlunder*0.50;
            }

            if (i%5==0) {
                total-=total*0.30;
            }
        }

        if (total>=expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.",total);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.",(total/expectedPlunder)*100);
        }
    }
}
