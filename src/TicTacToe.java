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



        // Takes the user input
        System.out.println("What cell would you like to chose?");
        String userInput = scanner.nextLine();


        playerTurn(board, userInput);
        printBoard(board);
    }

    private static void playerTurn(char[][] board, String userInput) {
        switch(userInput) {
            case "1":
                board[0][0] = 'X';
                break;
            case "2":
                board[0][1] = 'X';
                break;
            case "3":
                board[0][2] = 'X';
                break;
            case "4":
                board[1][0] = 'X';
                break;
            case "5":
                board[1][1] = 'X';
                break;
            case "6":
                board[1][2] = 'X';
                break;
            case "7":
                board[2][0] = 'X';
                break;
            case "8":
                board[2][1] = 'X';
                break;
            case "9":
                board[2][2] = 'X';
                break;
            default:
                System.out.println("Error!");
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }
}
