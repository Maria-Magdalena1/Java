package Java_Advanced.SetsandDictionaries.FixEmails;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String,String> peopleEmails=new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String email=scanner.nextLine();

            String domain=email.substring(email.indexOf("@")+1).toLowerCase();
            if (!(domain.endsWith("us") || domain.endsWith("uk") || domain.endsWith("com"))) {
                peopleEmails.put(input, email);
            }
            input=scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : peopleEmails.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
