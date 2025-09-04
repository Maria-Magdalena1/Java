package Java_Basics.Exams.Exam1;

import java.util.Scanner;

public class Ex3Gymnastics {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String country=scanner.nextLine();
        String equipment=scanner.nextLine();
        double difficulty=0;
        double execution=0;
        switch (country) {
            case "Russia":
                if (equipment.equals("ribbon")) {
                   difficulty=9.100;
                   execution=9.400;
                } else if (equipment.equals("hoop")) {
                    difficulty=9.300;
                    execution=9.800;
                } else if (equipment.equals("rope")) {
                    difficulty=9.600;
                    execution=9.000;
                }
                break;
            case "Bulgaria":
                if (equipment.equals("ribbon")) {
                    difficulty=9.600;
                    execution=9.400;
                } else if (equipment.equals("hoop")) {
                    difficulty=9.550;
                    execution=9.750;
                } else if (equipment.equals("rope")) {
                    difficulty=9.500;
                    execution=9.400;
                }
                break;
            case "Italy":
                if (equipment.equals("ribbon")) {
                    difficulty=9.200;
                    execution=9.500;
                } else if (equipment.equals("hoop")) {
                    difficulty=9.450;
                    execution=9.350;
                } else if (equipment.equals("rope")) {
                    difficulty=9.700;
                    execution=9.150;
                }
                break;
        }

        double sum=difficulty+execution;
        double percentage=(20-sum)/20*100;
        System.out.printf("The team of %s get %.3f on %s.%n",country,sum,equipment);
        System.out.printf("%.2f%%",percentage);
    }
}
