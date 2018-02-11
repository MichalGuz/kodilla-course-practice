package com.kodilla.testing.soccer;

import java.util.ArrayList;

public class PlayerCollector {

    private ArrayList<Player> real = new ArrayList<>();
    private ArrayList<Player> mcity = new ArrayList<>();

    public void addPlayer(Player player) {
        real.add(player);
    }

    public void removePlayer(Player player) {
        real.remove(player);
    }

    public Player getPlayer(int n) {
        return real.get(n);
    }

    public void showPlayer() {
        for(Player player: real) {
            System.out.println(player);
            System.out.println("Skills level: " + player.getSkills());
        }
    }

    public int getSize() {
        return real.size();
    }
}
