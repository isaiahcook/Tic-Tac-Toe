import java.util.Arrays;
import java.util.Scanner;

import javax.management.monitor.GaugeMonitor;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

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
        //Create a string variable that stores either 'x' or 'o' based on the players turn.
        String c = "_";
        if(player1) {
            c = "x";
        } else {
            c = "o";
        }
        //rows and collumns that reprensent the index that matches the position on the board.
        int row = 0;
        int col = 0;

        //The while loop only breaks once the user enters a valid position.
        while(true) {
            System.out.print("Enter a row number (0, 1, or 2): ");
            row = in.nextInt();
            System.out.print("Enter a column number (0, 1, or 2): ");
            col = in.nextInt();
            //check if the row and col are 0, 1 , or 2.
            if(row < 0 || col < 0 || row > 2 || col > 2) {
                System.out.println("This position is out of bounds! Please try again.");
                //Check if the position on the board the user entered is empty, if it has a - or not.
            } else if(board[row][col] != "_") {
                System.out.println("Someone has already made a move there! Please try again."); // would like to specify what player moved there.
        } else {
            break;
    }

        

    }
    //Set the position on the board at row, col to c.
    board[row][col] = c;

    if(playerHasWon(board) == 'x') {
        System.out.println(p1 + " has won!");
        gameEnded = True;
    } else if(playerHasWon(board) == 'o');
    System.out.println(p2 + " has won!");
    gameEnded = True;
    } else {
        // if no player has won check to see if there is a tie.
        if(boardIsFull(board)) {
            System.out.println("It's a Tie!");
            gameEnded = true;
        } else {
            // If it is player 2 turn make them alternate turns.
            player1 = !player1;
  }
  
 }
//function to make the tic tac toe board.
public static void drawBoard(String[][] board) {
System.out.println("Board:");
for(int i= 0; i < 3; i++) {
//inner for loop prints out each row of the board.
for(int j = 0; j <3; j++) {
    System.out.print(board[i][j]);
}
System.out.println();
}
}
//check to see if someone has won and returns the answer.
public static char playerHasWon(char[][] board) {
//check each row
    for(int i = 0; i < 3; i++) {
        if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '_') {
            return board[i][0];
        }
        //check each column
        for(int j = 0; j < 3; j++) {
            if(board[j][0] == board[j][1] && board[j][1] == board[j][2] && board[j][0] != '_') {
                return board[j][0];
}
}
if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '_') {
    return board[0][0];
}
if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '_') {
    return board[2][0];
}
return  ' ';
    }
}
public static boolean boardIsFull(char[][] board) {
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            if(board[i][j] == '_') {
                return false;
            }

        }
        }
}
}