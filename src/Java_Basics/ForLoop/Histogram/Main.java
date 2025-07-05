package Java_Basics.ForLoop.Histogram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        int countP1=0;
        int countP2=0;
        int countP3=0;
        int countP4=0;
        int countP5=0;
        double p1;
        double p2;
        double p3;
        double p4;
        double p5;

        for(int i=0;i<n;i++)
        {
            int number=Integer.parseInt(scanner.nextLine());
            if(number<200)
            {
                countP1++;
            }
            else if(number<400)
            {
                countP2++;
            }
            else if(number<600)
            {
                countP3++;
            }
            else if(number<800)
            {
                countP4++;
            }
            else
            {
                countP5++;
            }
        }

        p1=(countP1*1.0/n)*100;
        p2=(countP2*1.0/n)*100;
        p3=(countP3*1.0/n)*100;
        p4=(countP4*1.0/n)*100;
        p5=(countP5*1.0/n)*100;
        System.out.printf("%.2f/n",p1);
        System.out.printf("%.2f/n",p2);
        System.out.printf("%.2f/n",p3);
        System.out.printf("%.2f/n",p4);
        System.out.printf("%.2f/n",p5);
    }
}
