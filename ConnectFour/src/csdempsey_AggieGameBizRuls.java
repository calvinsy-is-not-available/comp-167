import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Name: Calvin S. Dempsey Jr, username: csdempsey
 * 
 * Date: 10/2/2022
 * 
 * Class Section: COMP 167 Sec. 02
 * 
 * Description: A psuedo-connect four game. When four consecutive x's are detected, in any direction, a winner is pronounced.
 * 				Game is either single-player (PvAI) or two-player (PvP).
 * 				This module creates the gameboard, tracks player progression, prints the board, 
 * 				executes moves, and determines if there is a winner.
 */

public class csdempsey_AggieGameBizRuls {
	// Global vars
	public static Scanner scnr = new Scanner(System.in);
	public static Random random = new Random();
	// gets gameBoard
	public static char[][] gameBoard() {
		char[][] board =
		{
			{'N','|','0','|','1','|','2','|','3','|','4','|','5','|','6','|','7','|','8','|','9','|'},	
		    {'0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|'},
		    {'1','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|'},
		    {'2','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|'},
		    {'3','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|'},
		    {'4','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|'},
		    {'5','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|'},
		    {'6','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|'},
		    {'7','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|'},
		    {'8','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|'},
		    {'9','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|','0','|'}
		};
		return board;
	}
	// algorithm for printing 2D arrays.
	public static void printArray(char[][]board) {
		for (int row = 0; row < board.length; row++) {
			for (int column = 0; column < board[row].length; column++) {
			System.out.print(board[row][column] + " ");
			}
			System.out.println(); //using this for new line to print array in matrix format.
		}
	}
	// displays next move from player(s).
	public static char[][] nextMovePlayer(int row, int column, char[][] board){
		boolean loop;
		if (board[row][column]== '0') {
			board[row][column] = 'x';
		}
		else { // Edge case code
			loop = true;
			while(loop) {
				int [] temp = again();
				row = temp[0];
				column = temp[1];
				if (board[row][column]== '0') {
					board[row][column] = 'x';
					loop = false;
				}
			}
		}
		return board;
	}
	// gets next move for AI
	public static char[][] nextMoveAI(char[][]board){
		System.out.println();
		System.out.println("Computer's turn:");
		boolean loop = true;
		int row = random.nextInt(10)+1;
		int column = 0;
		while(loop) {
			column = random.nextInt(10)+1;
			if(column%2==0) {
				loop = false;
			}
		}
		if (board[row][column]== '0') {
			board[row][column] = 'x';
		}
		else {
			loop = true;
			while(loop) {
				int[] temp = againAI();
				System.out.println(Arrays.toString(temp));
				row = temp[0];
				column = temp[1];
				if (board[row][column]== '0') {
					board[row][column] = 'x';
					loop = false;
				}
			}
		}
		return board;
	}
	// if move already exists, gets new move for the computer.
	public static int[] againAI() {
		int[] returnArray = new int[2];
		int r = random.nextInt(10)+1;
		int c = 0;
		boolean loop = true;
		while(loop) {
			c = random.nextInt(10)+1;
			if(c%2==0) {
				loop = false;
			}
		}
		returnArray[0] = r;
		returnArray[1]= c;
		return returnArray;
	}
	// converts user input into readable indices for nextMove algorithm.
	public static int[] interpreter(int row, int column) {
		int[] coordinates = new int[2];
		int zeroColumn = 2;
		if (column<10&&column>=0) {
			if(column == 0) {
			column+=2;
			}
			else {
				column = zeroColumn+(2*column);
			}
		}
		if (row<10&&row>=0) {
			row+=1;
		}
		coordinates[0]=row;
		coordinates[1]=column;
		return coordinates;
	}
	// Determines if game is multiplayer.
	public static boolean multiplayer() {
		boolean yes = false;
		System.out.println("Do you wish to play multiplayer (up to two players)?");
		System.out.println("Enter in: \"Yes\" or any key for \"No\"");
		String userInput = scnr.nextLine();
		System.out.println();
		userInput = userInput.toLowerCase();
		if (userInput.equals("yes")) {
			yes = true;
			System.out.println("Multiplayer Mode: When four x's are generated in any direction, game ends.");
			System.out.println( " :'( ");
			System.out.println();
			System.out.println("However, whoever places the last \"x,\" wins");
		}
		else {
			System.out.println("Single Player Mode: When four x's are generated in any direction, game ends");
			System.out.println( " :'( ");
			System.out.println();
		}
		return yes;
	}
	//checks winner
	public static boolean chickenDinner(char[][] board) {
		boolean finished = false;
		// Horizontal case
		for (int row = 1; row < 11; row+=1) {
			for (int col = 2; col<14; col+=2) {
				if ((board[row][col]!= '0')
					// Checking the next for places to the right of given
					&&(board[row][col+2]!= '0')
					&&(board[row][col+4]!= '0')
					&&(board[row][col+6]!= '0')) {
					finished = true;
					return finished;
				}
			}
		}
		// Vertical case
		for (int row = 1; row<8; row+=1) {
			for (int col = 2; col< 21; col+=2) {
				if ((board[row][col]!= '0')
					// Checking the next four places below given
					&&(board[row+1][col]!= '0')
					&&(board[row+2][col]!= '0')
					&&(board[row+3][col]!= '0')) {
					finished = true;
					return finished;
				}
			}
		}
		//Diagonal case: left to right
		for (int row = 1; row<8; row+=1) {
			for (int col = 2; col< 14; col+=2) {
				if ((board[row][col]!= '0')
					// Checking the next four places below given
					&&(board[row+1][col+2]!= '0')
					&&(board[row+2][col+4]!= '0')
					&&(board[row+3][col+6]!= '0')) {
					finished = true;
					return finished;
				}
			}
		}
		//Diagonal case: right to left
		for (int row = 1; row<8; row+=1) {
			for (int col = 20; col>6; col-=2) {
				if ((board[row][col]!= '0')
					// Checking the next four places below given
					&&(board[row+1][col-2]!= '0')
					&&(board[row+2][col-4]!= '0')
					&&(board[row+3][col-6]!= '0')) {
					finished = true;
					return finished;
				}
			}
		}
		return finished;
	}
	// if move already exists, gets new move for the player(s).
	public static int[] again() {
		int[] input = new int[2];
		System.out.println("Apologies, that entry already exists.");
		System.out.println("Please choose your row. Choices are 0-9.");
		input[0] = scnr.nextInt();
		System.out.println("Please choose your column. Choices are 0-9.");
		input[1] = scnr.nextInt();
		input = interpreter(input[0], input[1]);
		return input;
		
	}
}
