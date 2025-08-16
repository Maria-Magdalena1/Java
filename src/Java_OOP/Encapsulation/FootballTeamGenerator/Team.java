package Java_OOP.Encapsulation.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players=new ArrayList<>();
    }

    private void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("A name should not be empty.");
        }
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String playerName) {
        Player playerToRemove = players.stream()
                .filter(p -> p.getName().equals(playerName))
                .findFirst()
                .orElse(null);

        if (playerToRemove == null) {
            System.out.printf("Player %s is not in %s team.%n", playerName, this.name);
        } else {
            players.remove(playerToRemove);
        }
    }

    public double getRating() {
        if (players.isEmpty()) {
            return 0;
        }
        return players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0.0);
    }
}
