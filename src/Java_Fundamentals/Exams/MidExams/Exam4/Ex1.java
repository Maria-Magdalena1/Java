package Java_Fundamentals.Exams.MidExams.Exam4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double kgFood=Double.parseDouble(scanner.nextLine());
        double kgHay=Double.parseDouble(scanner.nextLine());
        double kgCover=Double.parseDouble(scanner.nextLine());
        double guineasWeight=Double.parseDouble(scanner.nextLine());

        double foodInGrams=kgFood*1000;
        double hayInGrams=kgHay*1000;
        double coverInGrams=kgCover*1000;
        double weightInGrams=guineasWeight*1000;

        boolean isEnough=true;

        for (int i=1;i<=30;i++) {
            foodInGrams-=300;
            if (foodInGrams<=0) {
                isEnough=false;
                break;
            }

            if (i%2==0) {
                hayInGrams-=foodInGrams*0.05;
            }

            if (hayInGrams<=0) {
                isEnough=false;
                break;
            }

            if (i%3==0) {
                coverInGrams-=weightInGrams/3;
            }

            if (coverInGrams<=0) {
                isEnough=false;
                break;
            }
        }

        if (isEnough) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodInGrams/1000,
                    hayInGrams/1000,coverInGrams/1000);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
