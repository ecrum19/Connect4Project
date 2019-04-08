import java.util.Scanner;
public class Connect4 {
    final static int Width = 6;
    final static int Height = 7;
    static char[][] board = new char[Width][Height];

    public char[][] getBoard() {
        return board;
    }

    public static void CreateBoard() {
        //fills board with '.' for the width and height
        for (int w = 0; Width > w; w += 1) {
            for (int h = 0; Height > h; h += 1) {
                board[w][h] = '.';
            }
        }
    }

    public static void PrintBoard() {
        //prints the board
        for (int w = 0; Width > w; w += 1) {
            for (int h = 0; Height > h; h += 1) {
                System.out.print(board[w][h]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void player1UI() {
        int x = UI.promptInt("Enter Column of desired move location: ");
        int y = UI.promptInt("Enter Row of desired move location: ");
        board[x][y] = 1;
    }



    public void player2UI() {
        int a = UI.promptInt("Enter Column of desired move location: ");
        int b = UI.promptInt("Enter Row of desired move location: ");
        board[a][b] = 0;
    }

    public static void main(String[] args) {
        CreateBoard();
        PrintBoard();
    }

}
