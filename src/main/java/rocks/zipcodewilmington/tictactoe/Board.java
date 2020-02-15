package rocks.zipcodewilmington.tictactoe;

import sun.lwawt.macosx.CInputMethod;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public char winner;
    public Character[][] game;

    public Board(Character[][] matrix) {
        game = matrix;
    }

    public Boolean isInFavorOfX() {
        xHorizontalWin();
        xVerticalWin();
        xNWSEWin();
        xSWNEWin();
        return winner == 'X';
    }

    public Boolean isInFavorOfO (){
        oHorizontalWin();
        oVerticalWin();
        oNWSEWin();
        oSWNEWin();
        return winner == 'O';
    }

    public Boolean isTie (){
        xHorizontalWin();
        xVerticalWin();
        xNWSEWin();
        xSWNEWin();
        oHorizontalWin();
        oVerticalWin();
        oNWSEWin();
        oSWNEWin();
        return winner == '\u0000';
    }

    public String getWinner (){
        xHorizontalWin();
        xVerticalWin();
        oHorizontalWin();
        oVerticalWin();
        xNWSEWin();
        xSWNEWin();
        oNWSEWin();
        oSWNEWin();
        if (winner == 'X'){
            return "X";
        } else if (winner == 'O') {
            return "O";
        } else {
            return "";
        }
    }

    // x win methods
    public void xHorizontalWin () {
        int yIndex = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                if (('X' == game[yIndex][j]) && (game[yIndex][j] == game[yIndex][j+1]) && (game[yIndex][j] == game[yIndex][j+2])) {
                    winner = 'X';
                }
                yIndex++;
            }
        }
    }

    public void xVerticalWin(){
        int xIndex = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                if (('X' == game[j][xIndex]) && (game[j][xIndex] == game[j+1][xIndex]) && (game[j][xIndex] == game[j+2][xIndex])) {
                    winner = 'X';
                }
                xIndex++;
            }
        }
    }

    public void xNWSEWin(){
        if ((game[0][0] == 'X') && (game[1][1] == 'X') && (game[2][2] == 'X')){
            winner = 'X';
        }
    }

    public void xSWNEWin(){
        if (('X' == game[2][0]) && ('X' == game[1][1]) && ('X' == game[0][2])){
            winner = 'X';
        }
    }

    // begin O win methods
    public void oHorizontalWin () {
        int yIndex = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                if (('O' == game[yIndex][j]) && (game[yIndex][j] == game[yIndex][j+1]) && (game[yIndex][j] == game[yIndex][j+2])) {
                    winner = 'O';
                }
                yIndex++;
            }
        }
    }

    public void oVerticalWin(){
        int xIndex = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                if (('O' == game[j][xIndex]) && (game[j][xIndex] == game[j+1][xIndex]) && (game[j][xIndex] == game[j+2][xIndex])) {
                    winner = 'O';
                }
                xIndex++;
            }
        }
    }

    public void oNWSEWin(){
        if ((game[0][0] == 'O') && (game[1][1] == 'O') && (game[2][2] == 'O')){
            winner = 'O';
        }
    }

    public void oSWNEWin(){
        if (('O' == game[2][0]) && ('O' == game[1][1]) && ('O' == game[0][2])){
            winner = 'O';
        }
    }
}