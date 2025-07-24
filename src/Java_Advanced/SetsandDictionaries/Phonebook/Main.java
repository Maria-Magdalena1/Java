package Java_Advanced.SetsandDictionaries.Phonebook;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Map<String,String> phonebook=new HashMap<>();
        while(!input.equals("search")) {
            String name=input.split("-")[0];
          String number= input.split("-")[1];
            phonebook.put(name,number);
            input=scanner.nextLine();
        }
        input=scanner.nextLine();
        while(!input.equals("stop")) {
            if (phonebook.containsKey(input)) {
                System.out.printf("%s -> %s%n",input,phonebook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n",input);
            }
            input=scanner.nextLine();
        }
    }
}
