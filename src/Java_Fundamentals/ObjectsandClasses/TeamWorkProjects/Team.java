package Java_Fundamentals.ObjectsandClasses.TeamWorkProjects;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private String creator;
    private List<String> members;

    public Team(String name,String creator) {
        this.name=name;
        this.creator=creator;
        this.members=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }

    public List<String> getMembers() {
        return members;
    }
}
