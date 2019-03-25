package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;
    private final String[] xWin = new String[]{"X","X","X"};
    private final String[] oWin = new String[]{"O","O","O"};

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {

        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < 3; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return Arrays.equals(getRow(rowIndex),xWin) || Arrays.equals(getRow(rowIndex),oWin);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return Arrays.equals(getColumn(columnIndex),xWin) || Arrays.equals(getColumn(columnIndex),oWin);
    }

    public String[] getDiagnal1(){
        return new String[]{board[0][0], board[1][1],board[2][2]};
    }

    public String[] getDiagnal2(){
        return new String[]{board[0][2],board[1][1],board[2][0]};
    }

    public String getWinner() {
        for (int i = 0; i < 3 ; i++) {
            if(isRowHomogenous(i)){
                return board[i][0];
            }else if (isColumnHomogeneous(i)){
                return board[0][i];
            }else if(Arrays.equals(getDiagnal1(),xWin) || Arrays.equals(getDiagnal1(),oWin) || Arrays.equals(getDiagnal2(),oWin) || Arrays.equals(getDiagnal2(),xWin)){
                return board[1][1];
            }
        }

        return "No Winner";
    }

    public String[][] getBoard() {
        return null;
    }
}
