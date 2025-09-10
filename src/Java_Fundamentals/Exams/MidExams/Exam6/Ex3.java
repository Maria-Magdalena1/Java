package Java_Fundamentals.Exams.MidExams.Exam6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warship = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            String[] parts = input.split(" ");
            String command=parts[0];

            if (command.equals("Fire")) {
                int index=Integer.parseInt(parts[1]);
                int damage=Integer.parseInt(parts[2]);

                if (validIndex(index,warship.size())) {
                    warship.set(index,warship.get(index)-damage);
                    if (warship.get(index)<=0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    }
                }
            } else if (command.equals("Defend")) {
                int startIndex=Integer.parseInt(parts[1]);
                int endIndex=Integer.parseInt(parts[2]);
                int damage=Integer.parseInt(parts[3]);

                if (validIndex(startIndex, pirateShip.size())&&
                        validIndex(endIndex, pirateShip.size())) {
                    for (int i=startIndex;i<=endIndex;i++) {
                        pirateShip.set(i,pirateShip.get(i)-damage);
                        if (pirateShip.get(i)<=0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }
                    }
                }

            } else if (command.equals("Repair")) {
                int index=Integer.parseInt(parts[1]);
                int health=Integer.parseInt(parts[2]);

                if (validIndex(index,pirateShip.size())) {
                    if (pirateShip.get(index)+health<=maxHealth) {
                        pirateShip.set(index,pirateShip.get(index)+health);
                    } else {
                        pirateShip.set(index,maxHealth);
                    }
                }
            } else if (command.equals("Status")) {
                int count=0;
                for (int section:pirateShip) {
                    if (section<maxHealth*0.20) {
                        count++;
                    }
                }

                System.out.printf("%d sections need repair.%n",count);
            }
            input = scanner.nextLine();
        }

        int pirateShipSum=0;
        int warshipSum=0;

        for (int section:pirateShip) {
            pirateShipSum+=section;
        }

        for(int section:warship) {
            warshipSum+=section;
        }

        System.out.printf("Pirate ship status: %d%n",pirateShipSum);
        System.out.printf("Warship status: %d",warshipSum);
    }

    public static boolean validIndex(int index,int lastIndex) {
        return index>=0&&index<lastIndex;
    }
}
