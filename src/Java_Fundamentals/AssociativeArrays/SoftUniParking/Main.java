package Java_Fundamentals.AssociativeArrays.SoftUniParking;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> system = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            if (command.split(" ")[0].equals("register")) {
                String username = command.split(" ")[1];
                String licensePlateNumber = command.split(" ")[2];
                register(system,username,licensePlateNumber);
            } else if (command.split(" ")[0].equals("unregister")) {
                String username = command.split(" ")[1];
                unregister(system,username);
            }
        }

        system.entrySet().forEach(entry-> System.out.printf("%s => %s%n",entry.getKey(),entry.getValue()));
    }

    public static void register(Map<String, String> system, String username, String plateNumber) {
        if (system.containsKey(username)) {
            System.out.printf("ERROR: already registered with plate number %s%n", system.get(username));
        } else {
            system.put(username, plateNumber);
            System.out.printf("%s registered %s successfully%n", username, plateNumber);
        }
    }

    public static void unregister(Map<String, String> system, String username) {

        if (!system.containsKey(username)) {
            System.out.printf("ERROR: user %s not found%n",username);
        } else {
            System.out.printf("%s unregistered successfully%n",username);
            system.remove(username);
        }
    }
}
