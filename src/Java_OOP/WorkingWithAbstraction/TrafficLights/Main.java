package Java_OOP.WorkingWithAbstraction.TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Lights[] lights= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(light -> Lights.valueOf(light))
                .toArray(Lights[]::new);

        int number=Integer.parseInt(scanner.nextLine());

        for (int i=1;i<=number;i++) {

            changeLights(lights);

            printLights(lights);
        }
    }

    private static void changeLights(Lights[] lights) {
        for (int i=0;i<lights.length;i++) {
            switch (lights[i]) {
                case YELLOW -> lights[i]=Lights.RED;
                case GREEN -> lights[i]=Lights.YELLOW;
                case RED -> lights[i]=Lights.GREEN;
            }
        }
    }

    private static void printLights(Lights[] lights) {
        for (Lights light :lights) {
            System.out.print(light+" ");
        }
        System.out.println();
    }
}
