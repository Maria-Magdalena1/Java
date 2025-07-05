package Java_Basics.WhileLoop.ExamPreparation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int failed=Integer.parseInt(scanner.nextLine());

        double sum=0;
        int failedTimes=0;
        String lastProblem="";
        int countExercises=0;
        boolean isFailed=true;
        while(failedTimes<failed)
        {
            String problemName=scanner.nextLine();
            if(problemName.equals("Enough"))
            {
                isFailed=false;
                break;
            }
            int grade=Integer.parseInt(scanner.nextLine());
            if(grade<=4)
            {
                failedTimes++;
            }
            sum+=grade;
            countExercises++;
            lastProblem=problemName;
        }
        if(isFailed)
        {
            System.out.printf("You need a break, %d poor grades.",failedTimes);
        }
        else
        {
            System.out.printf("Average score: %.2f%n",sum/countExercises);
            System.out.printf("Number of problems: %d%n",countExercises);
            System.out.printf("Last problem: %s%n",lastProblem);
        }

    }
}
