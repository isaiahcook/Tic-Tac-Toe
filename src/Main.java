import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        //create a 3x3 array that represent our tictactoe board
        String[][] board = new String[3][3];

        //initialize our board with dashes (empty positions)
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = "_";

            }
        }

        //Create a Scanner and ask the players for their names
        Scanner in = new Scanner(System.in);
        System.out.println("Lets play our Tic-Tac-Toe game!");
        System.out.println("Player 1 enter your name: ");
        String p1 = in.nextLine();
        System.out.println("Player 2 enter your name: ");
        String p2 = in.nextLine();

        for(int i = 0; i < 3; i++) {
            System.out.println(String.join("|",board[i]));
            }
        //Create a player one boolean that is true if it is player 1s turn and false if it is player 2s turn
        boolean player1 = true;

        //Create a gameEnded boolean and use it as the condition in the while loop
        boolean gameEnded = false;
        while(!gameEnded) {

        }
        //Print who's turn it is
        if (player1) {
            System.out.println(p1 + "'s turn (X)");
        } else {
            System.out.println(p2 + "'s turn (O)");
        }




    }


    }



