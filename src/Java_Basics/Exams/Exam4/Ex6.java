package Java_Basics.Exams.Exam4;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countPanetones=Integer.parseInt(scanner.nextLine());
        int maxPoints=Integer.MIN_VALUE;
        String maxPointsChef="";
        for (int i=0;i<countPanetones;i++) {
            String chefName=scanner.nextLine();
            String input=scanner.nextLine();
            int totalPoints=0;
            while(!input.equals("Stop")) {
                int points=Integer.parseInt(input);
                totalPoints+=points;
                input=scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n",chefName,totalPoints);
            if (totalPoints>maxPoints) {
                maxPoints=totalPoints;
                maxPointsChef=chefName;
                System.out.printf("%s is the new number 1!%n",chefName);
            }
        }

        System.out.printf("%s won competition with %d points!",maxPointsChef,maxPoints);


    }
}
