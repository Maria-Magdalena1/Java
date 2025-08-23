package Java_OOP.InterfacesAndAbstraction.MilitaryElite;

import java.util.ArrayList;
import java.util.Collection;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando{
    private Collection<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new ArrayList<>();
    }

    @Override
    public void addMission(Mission mission) {
        missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return missions;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append("\nMissions:");
        missions.forEach(m -> sb.append("\n  ").append(m));
        return sb.toString();
    }
}
