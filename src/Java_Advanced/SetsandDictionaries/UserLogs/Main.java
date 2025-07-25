package Java_Advanced.SetsandDictionaries.UserLogs;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        //user ip count
        Map<String,Map<String,Integer>> users=new TreeMap<>();
        while (!input.equals("end")) {
            String [] userData =input.split(" ");
            String ip= userData[0].split("=")[1];
            String user=userData[2].split("=")[1];
            users.putIfAbsent(user,new TreeMap<>());
            Map<String,Integer> ipAndComments=users.get(user);
            ipAndComments.put(ip, ipAndComments.getOrDefault(ip,0)+1);

            input=scanner.nextLine();
        }

        for (Map.Entry<String,Map<String,Integer>> entry:users.entrySet()) {
            String userName=entry.getKey();
            Map<String,Integer> ipAndCount=entry.getValue();
            System.out.println(userName+":");
            ipAndCount.forEach((k,v)->System.out.printf("%s => %d, ",k,v));
        }
    }
}
