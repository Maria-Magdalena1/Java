package Java_Fundamentals.Exams.FinalExams.Exam2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] parts = input.split("\\|");
            String command = parts[0];
            switch (command) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(parts[1]);
                    String firstPart = encryptedMessage.substring(0, numberOfLetters);
                    String remainingPart = encryptedMessage.substring(numberOfLetters);

                    encryptedMessage = remainingPart + firstPart;
                    break;
                case "Insert":
                    int index = Integer.parseInt(parts[1]);
                    String value = parts[2];

                    encryptedMessage = encryptedMessage.substring(0, index) + value + encryptedMessage.substring(index);
                    break;
                case "ChangeAll":
                    String substring = parts[1];
                    String replacement = parts[2];
                    encryptedMessage = encryptedMessage.replace(substring, replacement);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", encryptedMessage);
    }
}
