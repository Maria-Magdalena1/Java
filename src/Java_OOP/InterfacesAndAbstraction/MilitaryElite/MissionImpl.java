package Java_OOP.InterfacesAndAbstraction.MilitaryElite;

public class MissionImpl implements Mission {
    private String codeName;
    private State state;

    public MissionImpl(String codeName, State state) {
        this.codeName = codeName;
        this.state = state;
    }

    @Override
    public String getCodeName() { return codeName; }

    @Override
    public State getState() { return state; }

    @Override
    public void completeMission() {
        this.state = State.finished;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", codeName, state);
    }
}
