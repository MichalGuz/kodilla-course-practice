package com.kodilla.testing.soccer;

public class Goalkeeper implements Player {

    private int saves;
    private int kicksOff;
    private int penaltySaves;
    private String name;

    public Goalkeeper(int saves, int kicksOff, int penaltySaves, String name) {
        this.saves = saves;
        this.kicksOff = kicksOff;
        this.penaltySaves = penaltySaves;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSkills() {
        return saves + kicksOff + penaltySaves;
    }

    @Override
    public String toString() {
        return "Goalkeeper{" +
                "saves=" + saves +
                ", kicksOff=" + kicksOff +
                ", penaltySaves=" + penaltySaves +
                ", name='" + name + '\'' +
                '}';
    }
}
