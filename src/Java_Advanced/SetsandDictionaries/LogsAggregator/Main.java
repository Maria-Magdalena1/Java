package Java_Advanced.SetsandDictionaries.LogsAggregator;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //user duration
        //user ip
        Map<String, Integer> userDuration = new TreeMap<>();
        Map<String, Set<String>> userIp = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String ip = input.split("\\s+")[0];
            String user = input.split("\\s+")[1];
            int duration = Integer.parseInt(input.split("\\s+")[2]);
            userDuration.put(user,userDuration.getOrDefault(user,0)+duration);
            userIp.putIfAbsent(user,new TreeSet<>());
            userIp.get(user).add(ip);

        }

        //userDuration.forEach((k, v) -> {
        //    System.out.printf("%s: %d [", k, v);
        //    Set<String> ips = userIp.get(k);
        //    String ipList = String.join(", ", ips);
        //    System.out.print(ipList);
        //    System.out.println("]");
        //});
        for (String user : userDuration.keySet()) {
            int totalDuration = userDuration.get(user);
            Set<String> ips = userIp.get(user);
            String ipList=String.join(", ",ips);
            System.out.println(user + ": " + totalDuration + " [" + ipList+"]");
        }
    }
}
