package com.kodilla.testing.soccer;

public class SoccerProgram {
    public static void main(String[] args) {
        PlayerCollector real = new PlayerCollector();
        real.addPlayer(new Goalkeeper(2,3, 1, "Navas"));
        real.addPlayer(new Defender(6,4,1,1, "Ramos"));
        real.addPlayer(new Defender(5,3,0,0, "Varane"));
        real.addPlayer(new Defender(5,2,2,1,"Marcelo"));
        real.addPlayer(new Defender(3,6,1,1, "Carvajal"));
        real.addPlayer(new Midfielder(2,4,3,2,0,"Kroos"));
        real.addPlayer(new Midfielder(3,3,4,3,2, "Modric"));
        real.addPlayer(new Midfielder(1,3,1,3,3,"Asensio"));
        real.addPlayer(new Forward(10,3,1,6,"Ronaldo"));
        real.addPlayer(new Forward(5,5,0,5,"Bale"));
        real.showPlayer();
    }
}
