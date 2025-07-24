package Java_Advanced.SetsandDictionaries.ParkingLot;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<String> parkingLot=new LinkedHashSet<>();
        String input=scanner.nextLine();
        while (!input.equals("END")) {
            String direction=input.split(", ")[0];
            String carNumber=input.split(", ")[1];
            if (direction.equals("IN")) {
                parkingLot.add(carNumber);
            } else if (direction.equals("OUT")) {
                parkingLot.remove(carNumber);
            }
            input=scanner.nextLine();
        }
        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String number : parkingLot) {
                System.out.println(number);
            }
        }
    }
}
