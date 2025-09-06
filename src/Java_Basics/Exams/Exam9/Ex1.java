package Java_Basics.Exams.Exam9;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String city=scanner.nextLine();
        String packetType= scanner.nextLine();
        String vipDiscount=scanner.nextLine();
        int days=Integer.parseInt(scanner.nextLine());
        double price;
        switch (city) {
            case "Bansko":
            case "Borovets":
                if (packetType.equals("noEquipment")) {
                    price=80;
                    if (vipDiscount.equals("yes")) {
                        price-=price*0.05;
                    }
                } else if (packetType.equals("withEquipment")) {
                    price=100;
                    if (vipDiscount.equals("yes")) {
                        price-=price*0.10;
                    }
                } else {
                    System.out.println("Invalid input!");
                    return;
                }
                break;
            case "Varna":
            case "Burgas":
                if (packetType.equals("noBreakfast")) {
                    price=100;
                    if (vipDiscount.equals("yes")) {
                        price-=price*0.07;
                    }
                } else if (packetType.equals("withBreakfast")) {
                    price=130;
                    if (vipDiscount.equals("yes")) {
                        price-=price*0.12;
                    }
                } else {
                    System.out.println("Invalid input!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid input!");
                return;
        }

        double total=price*days;
        if (days<1) {
            System.out.println("Days must be positive number!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!",total);
        }
    }
}
