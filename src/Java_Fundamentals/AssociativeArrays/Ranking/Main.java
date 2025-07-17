package Java_Fundamentals.AssociativeArrays.Ranking;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Map<String,String> contestandpassword=new HashMap<>();

        while (!input.equals("end of contests")) {
            String[] inputs=input.split(":");
            String contestName=inputs[0];
            String password=inputs[1];
            contestandpassword.putIfAbsent(contestName,password);
            input=scanner.nextLine();
        }


        Map<String,Map<String,Integer>> users =new TreeMap<>();

        input=scanner.nextLine();
        while(!input.equals("end of submissions")) {
            String contest =input.split("=>")[0];
            String password=input.split("=>")[1];
            String username=input.split("=>")[2];
            int points=Integer.parseInt(input.split("=>")[3]);
            if (contestandpassword.containsKey(contest)&&contestandpassword.get(contest).equals(password)) {

                    //ako nqma user
                    users.putIfAbsent(username,new HashMap<>());
                    Map<String,Integer> userContest=users.get(username);
                    //userContest.put(contest,Math.max(userContest.getOrDefault(contest,0),points));
                    if (userContest.containsKey(contest)) {
                        int currentPoint=userContest.get(contest);
                        if (points>currentPoint) {
                            userContest.put(contest,points);
                        }
                    } else {
                        userContest.put(contest,points);
                    }
            }
            input=scanner.nextLine();
        }
        int maxPoints=0;
        String candidate="";
        for (Map.Entry<String,Map<String,Integer>> entry:users.entrySet()) {
            int totalPoints = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();

            if (totalPoints>maxPoints) {
                maxPoints=totalPoints;
                candidate=entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points./n",candidate,maxPoints);
        System.out.println("Ranking:");
        /*users.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().entrySet().stream()
                            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                            .forEach(e -> System.out.println("#  " + e.getKey() + " -> " + e.getValue()));
                });*/
        users.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().entrySet().stream().sorted((a,b)->b.getValue().compareTo(a.getValue()))
                    .forEach(e-> System.out.println("# "+e.getKey()+" -> "+e.getValue()));
        });

    }
}
