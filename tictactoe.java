import java.io.*;
import java.util.*;

public class tictactoe {
    public static void main(String args[]) {
        // Initialize variables to keep track of game
        int player = 0, winner = 0, choice = 0, row = 0, col = 0, line = 0;
        char[][] board = {
                            {' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}
                                            };

        // Draw board function
        for (int turn = 0; turn < 9 && winner == 0; turn++) {
            System.out.println("\n");
            System.out.println("-------------");
            System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | ");
            System.out.println("-------------");
            System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | ");
            System.out.println("-------------");
            System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | ");
            System.out.println("-------------");
        }
            // Player input

        // Game state function
    }
}