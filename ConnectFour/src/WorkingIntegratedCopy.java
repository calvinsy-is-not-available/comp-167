
public class WorkingIntegratedCopy {
	/** import java.util.Random;
	import java.util.Scanner;
	import java.util.Arrays;
	public class GameConnectFour {

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
		public static void printArray(char[][]board) {
			for (int row = 0; row < board.length; row++) {       //for loop for row iteration.
				for (int column = 0; column < board[row].length; column++) {   //for loop for column iteration.
				System.out.print(board[row][column] + " ");
				}
				System.out.println(); //using this for new line to print array in matrix format.
				}
		}
		public static int[] recordMove(int row, int column) {
			int[] recordArray = new int[2];
			recordArray[0]=row;
			recordArray[1]=column;
			return recordArray;

		}
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
			move[0] = row;
			move[1] = column;
			System.out.println(Arrays.toString(move));
			return board;
		}
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
			move[0] = row;
			move[1] = column;
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
			System.out.println(Arrays.toString(move));
			return board;
		}
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
		// Gets input
		public static int[] getInput(Scanner scnr) {
			int[] returnArray = new int[2];
			System.out.println("Please choose your row. Choices are 0-9.");
			System.out.println();
			int row = scnr.nextInt();
			System.out.println("Please choose your column. Choices are 0-9.");
			System.out.println();
			int col = scnr.nextInt();
			returnArray[0] = row;
			returnArray[1] = col;
			return returnArray;
		}
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
		public static void welcomeMessage() {
			System.out.println("Welcome to Aggie Game: an interpretation of Connect Four.");
		}
		public static void welcomeMessageTwo() {
			System.out.println("Preparing game...");
			System.out.println("...");
			System.out.println("Loading board...");
			System.out.println("Stealing personal information :) ...");
			System.out.println("Ready:");
			System.out.println();
			System.out.println("Player's turn:");
			System.out.println();
		}
		public static void endMessage() {
			System.out.println("Winner detected");
			System.out.println("...");
		}
		public static void endMessageTwo() {
			System.out.println("Terminating game  ...  terminating me  ...");
			System.out.println(" :( ");
			System.out.println("The end");
		}
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
		// Global vars
		public static int[] move = new int[2];
		public static Scanner scnr = new Scanner(System.in);
		public static Random random = new Random();
		// Main
		public static void main(String[] args) {
			char[][] board = gameBoard();
			int[] input;
			boolean play = true;
			int count = 0;
			welcomeMessage();
			boolean mode_two_people = multiplayer();
			welcomeMessageTwo();
			printArray(board);
			// Play loop
			while(play){
				if (chickenDinner(board)) {
					endMessage();
					if (count % 2 == 0) {
						System.out.println("Player One placed the last x");
						System.out.println("Therefore Player One wins");
						endMessageTwo();
					}
					else {
						System.out.println("Player Two placed the last x");
						System.out.println("Therefore, Player Two wins");
						endMessageTwo();
					}
					break;
				}
				if(mode_two_people) {
					if (count % 2 == 0){
						input = getInput(scnr);
						input = interpreter(input[0], input[1]);
						board = nextMovePlayer(input[0],input[1],board);
						System.out.println("Player Two Board:");
					}
					else {
						input = getInput(scnr);
						input = interpreter(input[0], input[1]);
						board = nextMovePlayer(input[0],input[1],board);
						System.out.println("Player One Board:");
					}
					printArray(board);
					count = count +1;
				}
				else {
					if (count % 2 == 0){
						input = getInput(scnr);
						input = interpreter(input[0], input[1]);
						board = nextMovePlayer(input[0],input[1],board);
						System.out.println("Your board:");
					}
					else {
						System.out.println("passed");
						board = nextMoveAI(board);
						System.out.println();
					}
					printArray(board);
					count = count +1;
				}
			}
		}
	}
	**/ 
}

