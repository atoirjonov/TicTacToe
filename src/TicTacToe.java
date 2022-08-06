import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);


        /*
        Creates a 2D array named board in order
        to create 3 x 3 board
         */
        char [][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        printBoard(board);

        // The while that decides whether the game continues until the board is full.
        while (true) {
            // User's turn
            playerTurn(board, scanner);
            if(isGameFinished(board)) {
                break;
            }
            printBoard(board);

            // Computer's turn
            computerTurn(board);
            if(isGameFinished(board)) {
                break;
            }
            printBoard(board);
        }


    }

    private static boolean isGameOver(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Computer generates random number
     *
     * @param board
     */
    private static void computerTurn(char[][] board) {
        Random rand = new Random();
        int computerMove;
        while(true) {
            computerMove = rand.nextInt(9) + 1;
            if(isValidMove(board, computerMove)) {
                break;
            }
        }
        System.out.println("Computer chose " + computerMove);
        placeMove(board, Integer.toString(computerMove), 'O');
    }

    /**
     * Lets the player chose their move by entering a number
     * between 1 and 9.
     *
     * @param board
     * @param scanner
     */
    private static void playerTurn(char[][] board, Scanner scanner) {
        String userInput;
        while (true) {
            System.out.println("What cell would you like to chose(1-9)?");
            userInput = scanner.nextLine();
            if(isValidMove(board, Integer.parseInt(userInput))) {
                break;
            } else {
                System.out.println("You have made a wrong move.");
            }
        }
        placeMove(board, userInput, 'X');
    }

    /**
     * Inserts or places a move of a player.
     *
     * @param board
     * @param position
     * @param symbol
     */
    private static void placeMove(char[][] board, String position, char symbol) {
        switch(position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println("Error!");
        }
    }

    /**
     * Prints out an empty 3x3 board in the console.
     * @param board
     */
    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }

    /**
     * Checks whether the position is available
     * @param board
     * @param position
     * @return
     */
    private static boolean isValidMove(char[][] board, int position) {
        switch (position) {
            case 1:
                return (board[0][0] == ' ');
            case 2:
                return (board[0][1] == ' ');
            case 3:
                return (board[0][2] == ' ');
            case 4:
                return (board[1][0] == ' ');
            case 5:
                return (board[1][1] == ' ');
            case 6:
                return (board[1][2] == ' ');
            case 7:
                return (board[2][0] == ' ');
            case 8:
                return (board[2][1] == ' ');
            case 9:
                return (board[2][2] == ' ');
            default:
                 return false;
        }

    }


    /**
     * Breaks the game is the board is full.
     * @param baord
     */
    private static boolean isGameFinished(char[][] baord) {
        return true;
    }


}
