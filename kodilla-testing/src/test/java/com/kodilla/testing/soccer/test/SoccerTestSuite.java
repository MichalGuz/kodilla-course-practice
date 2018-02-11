package com.kodilla.testing.soccer.test;

import com.kodilla.testing.soccer.*;
import org.junit.*;

public class SoccerTestSuite {

    public static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of all tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("This is the end of tests");
    }

    @Before
    public void beforeEveryTest() {
        testCounter ++;
        System.out.println("The test #" + testCounter);
    }

    @Test
    public void testAddPlayer() {
        // Given
        Player player1 = new Goalkeeper(6,9,1,"Dobry");
        PlayerCollector team1 = new PlayerCollector();

        // When
        team1.addPlayer(player1);

        // Then
        Player result = team1.getPlayer(0);
        Assert.assertEquals(result, player1);
        // Assert.assertEquals(player1, team1.getPlayer(0));
    }

    @Test
    public void testRemovePlayer() {
        //Given
        Player player1 = new Defender(2,15,0,0,"Brutal");
        PlayerCollector team2 = new PlayerCollector();
        team2.addPlayer(player1);

        // When
        team2.removePlayer(player1);

        // Then
        int size = team2.getSize();
        Assert.assertEquals(0, size);
    }

    @Test
    public void testGetPlayer() {
        // Given
        Player player2 = new Forward(2,1,0,3,"Sredniak");
        PlayerCollector team3 = new PlayerCollector();
        team3.addPlayer(player2);

        // When
        Player tester;
        tester = team3.getPlayer(0);

        // Then
        Assert.assertEquals(tester, player2);
    }
}
