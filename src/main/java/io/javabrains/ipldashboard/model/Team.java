package io.javabrains.ipldashboard.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {

    public Team(String teamName, long totalMatches) {
        this.teamName = teamName;
        this.totalMatches = totalMatches;
    }

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String teamName;
    private long totalMatches;
    private long totalWins;

    public long getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public long getTotalMatches() {
        return totalMatches;
    }

    public long getTotalWins() {
        return totalWins;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTotalMatches(long totalMatches) {
        this.totalMatches = totalMatches;
    }

    public void setTotalWins(long totalWins) {
        this.totalWins = totalWins;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", totalMatches=" + totalMatches +
                ", totalWins=" + totalWins +
                '}';
    }
}
