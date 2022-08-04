import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Create a 2D array named board in order
        to create 3 x 3 board
         */
        char [][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        printBoard(board);

        // Takes the user input
        System.out.println("What cell would you like to chose?");
        String userInput = scanner.nextLine();
        System.out.println(userInput);
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }
}
