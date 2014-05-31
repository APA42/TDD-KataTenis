package com.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

/**
 * Created with IntelliJ IDEA.
 * User: aitor
 * Date: 31/05/14
 * Time: 11:11
 * To change this template use File | Settings | File Templates.
 */
public class TenisTest {
    Tenis tenis;
    @Before
    public void setUp() throws Exception {
        tenis = new Tenis();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void addFirstPointToPLayer1() throws Exception {
        addScoreToPlayer(1, 1);

        assertEquals(15, tenis.getScorePlayer1());
    }

    @Test
    public void addSecondPointToPLayer1() throws Exception {
        addScoreToPlayer(1, 2);

        assertEquals(30, tenis.getScorePlayer1());
    }
    @Test
    public void addThirdPointToPLayer1() throws Exception {
        addScoreToPlayer(1, 3);

        assertEquals(40, tenis.getScorePlayer1());
    }
    @Test
    public void addFirtsPointToPLayer2() throws Exception {
        addScoreToPlayer(2, 1);

        assertEquals(15, tenis.getScorePlayer2());
    }
    @Test
    public void addSecondPointToPLayer2() throws Exception {
        addScoreToPlayer(2, 2);

        assertEquals(30, tenis.getScorePlayer2());
    }
    @Test
    public void player2WinsGameWhenScoring4thTime() throws Exception {
        addScoreToPlayer(2, 4);
        assertEquals(2, tenis.whoWonTheGame());
    }
    @Test
    public void player2DoesNotWinGameWhenScoring3thTime() throws Exception {
        addScoreToPlayer(2, 3);
        assertTrue(2 != tenis.whoWonTheGame());
    }
    @Test
    public void player1DoesNotWinGameWhenScoring3thTime() throws Exception {
        addScoreToPlayer(1, 3);
        assertTrue(1 != tenis.whoWonTheGame());
    }
    @Test
    public void player2DoesNotWinsGameWhenScoring4thTimeAfterPlayer1ScoreThreeTimes() throws Exception {
        addScoreToPlayer(1, 3);
        addScoreToPlayer(2, 4);
        assertTrue(2 != tenis.whoWonTheGame());
    }
    @Test
    public void player1DoesNotWinsGameWhenScoring4thTimeAfterPlayer2ScoreThreeTimes() throws Exception {
        addScoreToPlayer(2, 3);
        addScoreToPlayer(1, 4);
        assertTrue(1 != tenis.whoWonTheGame());
    }


    private void addScoreToPlayer(int player, int numberOfPointsScored){
        if (player == 1){
            for(int i = 0; i<numberOfPointsScored ;i++){
                tenis.addPointToPlayer1();
            }
        }
        else if (player == 2){
            for(int i = 0; i<numberOfPointsScored ;i++){
                tenis.addPointToPlayer2();
            }

        }


    }
}
