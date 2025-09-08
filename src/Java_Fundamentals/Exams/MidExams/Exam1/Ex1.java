package Java_Fundamentals.Exams.MidExams.Exam1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        double price =0;
        while (!input.equals("special")&&!input.equals("regular")) {
            double prices=Double.parseDouble(input);
            if (prices<0) {
                System.out.println("Invalid price!");
                input=scanner.nextLine();
                continue;
            }
            price +=prices;
            input=scanner.nextLine();
        }

        double taxes= price *0.20;
        double totalPrice=price+taxes;

        if (totalPrice==0) {
            System.out.println("Invalid order!");
            return;
        }

        if (input.equals("special")) {
            totalPrice-=totalPrice*0.10;
        }
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n",price);
        System.out.printf("Taxes: %.2f$%n",taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$",totalPrice);
    }

}
