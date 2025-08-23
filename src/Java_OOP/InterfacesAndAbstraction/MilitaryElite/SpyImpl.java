package Java_OOP.InterfacesAndAbstraction.MilitaryElite;

public class SpyImpl extends SoldierImpl implements Spy{
    private int codeNumber;

    public SpyImpl(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public int getCodeNumber() { return codeNumber; }

    @Override
    public String toString() {
        return super.toString() + "\nCode Number: " + codeNumber;
    }
}
