package Java_OOP.InterfacesAndAbstraction.MilitaryElite;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Soldier> soldiers = new LinkedHashMap<>();

        String line;
        while (!(line = scanner.nextLine()).equals("End")) {
            String[] tokens = line.split("\\s+");
            String type = tokens[0];
            int id = Integer.parseInt(tokens[1]);
            String firstName = tokens[2];
            String lastName = tokens[3];

            switch (type) {
                case "Private":
                    double salary = Double.parseDouble(tokens[4]);
                    PrivateImpl priv = new PrivateImpl(id, firstName, lastName, salary);
                    soldiers.put(id, priv);
                    break;

                case "LieutenantGeneral":
                    salary = Double.parseDouble(tokens[4]);
                    LieutenantGeneralImpl general = new LieutenantGeneralImpl(id, firstName, lastName, salary);

                    for (int i = 5; i < tokens.length; i++) {
                        int privateId = Integer.parseInt(tokens[i]);
                        Soldier soldier = soldiers.get(privateId);
                        if (soldier instanceof Private) {
                            general.addPrivate((Private) soldier);
                        }
                    }
                    soldiers.put(id, general);
                    break;

                case "Engineer":
                    salary = Double.parseDouble(tokens[4]);
                    try {
                        Corps corps = Corps.valueOf(tokens[5]);
                        EngineerImpl engineer = new EngineerImpl(id, firstName, lastName, salary, corps);

                        for (int i = 6; i < tokens.length; i += 2) {
                            String partName = tokens[i];
                            int hours = Integer.parseInt(tokens[i + 1]);
                            Repair repair = new RepairImpl(partName, hours);
                            engineer.addRepair(repair);
                        }
                        soldiers.put(id, engineer);
                    } catch (IllegalArgumentException e) {
                        // invalid corps → skip
                    }
                    break;

                case "Commando":
                    salary = Double.parseDouble(tokens[4]);
                    try {
                        Corps corps = Corps.valueOf(tokens[5]);
                        CommandoImpl commando = new CommandoImpl(id, firstName, lastName, salary, corps);

                        for (int i = 6; i < tokens.length; i += 2) {
                            String codeName = tokens[i];
                            String stateStr = tokens[i + 1];
                            try {
                                State state = State.valueOf(stateStr);
                                Mission mission = new MissionImpl(codeName, state);
                                commando.addMission(mission);
                            } catch (IllegalArgumentException e) {
                                // invalid mission state → skip
                            }
                        }
                        soldiers.put(id, commando);
                    } catch (IllegalArgumentException e) {
                        // invalid corps → skip
                    }
                    break;

                case "Spy":
                    int codeNumber = Integer.parseInt(tokens[4]);
                    SpyImpl spy = new SpyImpl(id, firstName, lastName, codeNumber);
                    soldiers.put(id, spy);
                    break;
            }
        }

        soldiers.values().forEach(s -> System.out.println(s));
    }
    }

