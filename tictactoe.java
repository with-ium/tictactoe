import java.io.*;
import java.util.*;

public class tictactoe {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Initialize variables to keep track of game
        int player = 0, winner = 0, choice = 0, row = 0, col = 0;
        char letter;
        char[][] board = {
                            {'1', '2', '3'},
                            {'4', '5', '6'},
                            {'7', '8', '9'}
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

            player = (turn % 2) + 1;
            letter = (player == 1) ? 'X' : 'O';

            // Player input
            do {
                System.out.println("\nPlayer " + player + ", enter your spot " + letter + ": ");
                choice = sc.nextInt(); sc.nextLine();

                row = --choice / 3;
                col = choice % 3;
            } while (choice < 0 || choice > 9 || board[row][col] > '9');

            board[row][col] = letter;

            // Game state function
            
            if ((board[0][0] == board[1][1] && board[0][0] == board[2][2]) || (board[0][2] == board[1][1] && board[0][2] == board[2][0])) {
                // Diagonal win states
                winner = player;
            }
            else {
                // Check row and col for win states
                for (int line = 0; line < 3; line++) {
                    if ((board[line][0] == board[line][1] && board[line][0] == board[line][2]) ||
                         board[0][line] == board[1][line] && board[0][line] == board[2][line]) {
                        winner = player;
                    }
                }
            }
        }
        
        if (winner == 0) {
            System.out.println("\nNo one has won. It is a draw.");
        }
        else {
            System.out.println("\nWinner is player " + player + "!");
        }
        

        // Game over, show final board
        System.out.println("\n");
        System.out.println("-------------");
        System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | ");
        System.out.println("-------------");
        System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | ");
        System.out.println("-------------");
        System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | ");
        System.out.println("-------------");
    }
}