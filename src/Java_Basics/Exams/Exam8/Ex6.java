package Java_Basics.Exams.Exam8;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int maxPoints=Integer.MIN_VALUE;
        String nameWithMaxPoints="";
        while (!name.equals("Stop")) {
            int points=0;
            for (int i=0;i<name.length();i++) {

                int number=Integer.parseInt(scanner.nextLine());
                if (name.charAt(i)==number) {
                    points+=10;
                } else {
                    points+=2;
                }
            }

            if (points>maxPoints) {
                maxPoints=points;
                nameWithMaxPoints=name;
            }
            name=scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!",nameWithMaxPoints,maxPoints);
    }
}
