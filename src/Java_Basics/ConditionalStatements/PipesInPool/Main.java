package Java_Basics.ConditionalStatements.PipesInPool;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double pipe1 = p1 * h;//litri
        double pipe2 = p2 * h;//litri
        double fullLiters = pipe1 + pipe2;//litri obshto
        double fullpercentage = (fullLiters / v) * 100;//procent napulnen
        double percentageP1 = (pipe1 / fullLiters) * 100;//procent ot napulnenoto
        double percentageP2 = (pipe2 / fullLiters) * 100;//rocent ot napulnenoto


        if (fullpercentage <= v) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    fullpercentage, percentageP1, percentageP2);
        } else {
            double diff = Math.abs(v - pipe1 - pipe2);
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, diff);

        }

    }
}
