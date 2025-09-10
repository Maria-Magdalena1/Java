package Java_Fundamentals.Exams.FinalExams.Exam4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,int[]> heroes=new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String heroName=tokens[0];
            int hp= Integer.parseInt(tokens[1]);
            int mp= Integer.parseInt(tokens[2]);
            heroes.put(heroName,new int[]{hp,mp});
        }

        String input=scanner.nextLine();
        while (!input.equals("End")) {
            String []tokens=input.split(" - ");
            String action=tokens[0];
            String heroName=tokens[1];

            if (action.equals("CastSpell")) {
                int mpNeeded= Integer.parseInt(tokens[2]);
                String spellName=tokens[3];
                if (heroes.get(heroName)[1]>=mpNeeded) {
                    heroes.get(heroName)[1]-=mpNeeded;
                    System.out.printf("%s has successfully cast %s and now has %s MP!%n",
                            heroName,spellName,heroes.get(heroName)[1]);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
                }
            } else if (action.equals("TakeDamage")) {
                int damage= Integer.parseInt(tokens[2]);
                String attacker=tokens[3];

                heroes.get(heroName)[0]-=damage;
                if (heroes.get(heroName)[0]>0) {
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                            heroName,damage,attacker,
                            heroes.get(heroName)[0]);
                } else {
                    System.out.printf("%s has been killed by %s!%n",heroName,attacker);
                    heroes.remove(heroName);

                }
            } else if (action.equals("Recharge")) {
                int amount= Integer.parseInt(tokens[2]);
                if (amount+heroes.get(heroName)[1]<=200) {
                    heroes.get(heroName)[1]+=amount;
                } else {
                    amount=200-heroes.get(heroName)[1];
                    heroes.get(heroName)[1]=200;
                }
                System.out.printf("%s recharged for %d MP!%n",heroName,amount);
            } else if (action.equals("Heal")) {
                int amount= Integer.parseInt(tokens[2]);
                if (amount+heroes.get(heroName)[0]<=100) {
                    heroes.get(heroName)[0]+=amount;
                } else {
                    amount=100-heroes.get(heroName)[0];
                    heroes.get(heroName)[0]=100;
                }
                System.out.printf("%s healed for %d HP!%n",heroName,amount);
            }
            input=scanner.nextLine();
        }

        for (Map.Entry<String,int[]> entry:heroes.entrySet()) {
            String heroName=entry.getKey();
            int hp=entry.getValue()[0];
            int mp=entry.getValue()[1];
            //if (hp>0&&mp>0) {
            //
            //}
            System.out.println(heroName);
            System.out.println("HP: "+hp);
            System.out.println("MP: "+mp);
        }
    }
}
