package com.kodilla.testing.soccer;

public class Forward implements Player {

    private int goals;
    private int assists;
    private int penaltyMisses;
    private int offSides;
    private String name;

    public Forward(int goals, int assists, int penaltyMisses, int offSides, String name) {
        this.goals = goals;
        this.assists = assists;
        this.penaltyMisses = penaltyMisses;
        this.offSides = offSides;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSkills() {
        return goals + assists - penaltyMisses - offSides;
    }

    @Override
    public String toString() {
        return "Forward{" +
                "goals=" + goals +
                ", assists=" + assists +
                ", penaltyMisses=" + penaltyMisses +
                ", offSides=" + offSides +
                ", name='" + name + '\'' +
                '}';
    }
}
