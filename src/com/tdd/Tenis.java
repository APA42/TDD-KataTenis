package com.tdd;

/**
 * Created with IntelliJ IDEA.
 * User: aitor
 * Date: 31/05/14
 * Time: 11:10
 * To change this template use File | Settings | File Templates.
 */
public class Tenis {
    private int player1Counter = 0;
    private int player2Counter = 0;
    private boolean ventaja_1 = false;
    private boolean ventaja_2 = false;


    // 1->40 y 2->40
    // 1 marca => ventaja_1
    // 1 marca => gana

    public void addPointToPlayer1() {
        ventaja_1 = ( 40 == player1Counter && 40 == player2Counter);
        ventaja_2 = !ventaja_1;

        if ( 30 == player1Counter) {
            player1Counter = player1Counter + 10;
        }
        else if (player1Counter < 40) {
            player1Counter = player1Counter + 15;
        }
    }
    public int getScorePlayer1() {
        return player1Counter;
    }
    public int getScorePlayer2() {
        return player2Counter;
    }

    public void addPointToPlayer2() {
        if ( 30 == player2Counter) {
            player2Counter = player2Counter + 10;
        }
        else {
            player2Counter = player2Counter + 15;
        }
    }

    public int whoWonTheGame(){
        if ( player1Counter == 40 && player2Counter==40 ){

        }
        if (player1Counter > 40){
            return 1;
        }
        if (player2Counter > 40) {
            return 2;
        }
        return 0;
    }
}
