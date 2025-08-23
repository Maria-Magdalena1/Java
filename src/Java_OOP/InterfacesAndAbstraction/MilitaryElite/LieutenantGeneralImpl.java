package Java_OOP.InterfacesAndAbstraction.MilitaryElite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral{
    private Collection<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public void addPrivate(Private priv) {
        privates.add(priv);
    }

    @Override
    public Collection<Private> getPrivates() {
        return privates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append("\nPrivates:");
        privates.stream()
                .sorted(Comparator.comparingInt(Soldier::getId).reversed())
                .forEach(p -> sb.append("\n  ").append(p));
        return sb.toString();
    }
}
