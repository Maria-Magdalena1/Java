package Java_Basics.Exams.Exam2;

import java.util.Scanner;

public class Ex5FitnessCentre {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countPeople=Integer.parseInt(scanner.nextLine());
        int countBack=0;
        int countChest=0;
        int countLegs=0;
        int countAbs=0;
        int countShake=0;
        int countBar=0;

        for (int i=0;i<countPeople;i++) {
            String purpose=scanner.nextLine();
            switch (purpose) {
                case "Back":
                    countBack++;
                    break;
                case "Chest":
                    countChest++;
                    break;
                case "Legs":
                    countLegs++;
                    break;
                case "Abs":
                    countAbs++;
                    break;
                case "Protein shake":
                    countShake++;
                    break;
                case "Protein bar":
                    countBar++;
                    break;
            }
        }
        int peopleForProtein=countShake+countBar;
        double percentageWorkOut=((countPeople-peopleForProtein)*1.0/countPeople)*100;
        double percentageProtein=(peopleForProtein*1.0/countPeople)*100;
        System.out.printf("%d - back%n",countBack);
        System.out.printf("%d - chest%n",countChest);
        System.out.printf("%d - legs%n",countLegs);
        System.out.printf("%d - abs%n",countAbs);
        System.out.printf("%d - protein shake%n",countShake);
        System.out.printf("%d - protein bar%n",countBar);
        System.out.printf("%.2f%% - work out%n",percentageWorkOut);
        System.out.printf("%.2f%% - protein",percentageProtein);
    }
}

