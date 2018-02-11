package com.kodilla.testing.soccer;

public class Midfielder implements Player {

    private int assist;
    private int keyPasses;
    private int fauls;
    private int goals;
    private int loss;
    private String name;

    public Midfielder(int assist, int keyPasses, int fauls, int goals, int loss, String name) {
        this.assist = assist;
        this.keyPasses = keyPasses;
        this.fauls = fauls;
        this.goals = goals;
        this.loss = loss;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSkills() {
        return assist + keyPasses + goals - fauls - loss;
    }

    @Override
    public String toString() {
        return "Midfielder{" +
                "assist=" + assist +
                ", keyPasses=" + keyPasses +
                ", fauls=" + fauls +
                ", goals=" + goals +
                ", loss=" + loss +
                ", name='" + name + '\'' +
                '}';
    }
}
