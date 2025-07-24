package Java_Advanced.SetsandDictionaries.CountSymbols;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<Character,Integer> chars=new TreeMap<>();
        String input=scanner.nextLine();
        for (int i=0;i<input.length();i++) {
            char symbol=input.charAt(i);
            chars.put(symbol,chars.getOrDefault(symbol,0)+1);

        }
        chars.forEach((k,v)-> System.out.printf("%c: %d time/s%n",k,v));
    }
}
