package Java_Basics.Exams.Exam5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countPanetone=Integer.parseInt(scanner.nextLine());

        int maxUsedFlour=Integer.MIN_VALUE;
        int maxUsedSugar=Integer.MIN_VALUE;

        int sumSugar=0;
        int sumFlour=0;

        for (int i=0;i<countPanetone;i++) {
            int usedGramsOfSugar=Integer.parseInt(scanner.nextLine());
            int usedGramsOfFlour=Integer.parseInt(scanner.nextLine());
            sumSugar+=usedGramsOfSugar;
            sumFlour+=usedGramsOfFlour;

            if (usedGramsOfSugar>maxUsedSugar) {
                maxUsedSugar=usedGramsOfSugar;
            }

            if (usedGramsOfFlour>maxUsedFlour) {
                maxUsedFlour=usedGramsOfFlour;
            }

        }

        int usedPacketsOfSugar=(int)Math.ceil(sumSugar/950.0);
        int usedPacketsOfFlour=(int)Math.ceil(sumFlour/750.0);

        System.out.printf("Sugar: %d%n",usedPacketsOfSugar);
        System.out.printf("Flour: %d%n",usedPacketsOfFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxUsedFlour,maxUsedSugar);
    }
}
