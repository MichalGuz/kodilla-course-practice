package com.kodilla.testing.soccer;

public class Defender implements Player {

    private int blocks;
    private int fauls;
    private int assists;
    private int goals;
    private String name;

    public Defender(int blocks, int fauls, int assists, int goals, String name) {
        this.blocks = blocks;
        this.fauls = fauls;
        this.assists = assists;
        this.goals = goals;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSkills() {
        return blocks + assists + goals - fauls;
    }

    @Override
    public String toString() {
        return "Defender{" +
                "blocks=" + blocks +
                ", fauls=" + fauls +
                ", assists=" + assists +
                ", goals=" + goals +
                ", name='" + name + '\'' +
                '}';
    }
}
