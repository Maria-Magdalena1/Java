package Java_Basics.Exams.Exam9;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int height=Integer.parseInt(scanner.nextLine());
        int width=Integer.parseInt(scanner.nextLine());
        int percentage=Integer.parseInt(scanner.nextLine());

        int allSpace=height*width*4;

        int allLitersPaint = (int) Math.ceil(allSpace-(allSpace*1.0*percentage)/100);

        String command=scanner.nextLine();
        while (!command.equals("Tired!")) {

            int liters=Integer.parseInt(command);
            allLitersPaint -=liters;

            if (allLitersPaint <0){
                System.out.printf("All walls are painted and you have %d l paint left!",Math.abs(allLitersPaint));
                return;
            }
            command=scanner.nextLine();
        }
        if (allLitersPaint >0) {
            System.out.printf("%d quadratic m left.", allLitersPaint);
        } else {
            System.out.println("All walls are painted! Great job, Pesho!");
        }



    }
}
