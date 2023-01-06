import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class scrapCode {
/**		else {
			System.out.println("Error: choice already exists.");
			return board;
		}
 * boolean loop = true;
			while(loop) {
				int[] edgeCase = again();
				row = edgeCase[0];
				column = edgeCase[1];
				if (board[row][column]== '0') {
					board[row][column] = 'R';
					break;
				}
				else {
					System.out.println("Error: choice already exists. Please make a new choice.");
					edgeCase = again();
					continue;
				}
			}
			move = recordMove(row, column);
			return board;
			
			public static int[] recordMove(int row, int column) {
				int[] recordArray = new int[2];
				recordArray[0]=row;
				recordArray[1]=column;
				return recordArray;
		
			}
			public static char[][] nextMovePlayer(int row, int column, char[][] board){
				if (board[row][column]== '0') {
					board[row][column] = 'x';
					move = recordMove(row, column);
				}
				// Edge case code
				return board;
			}
			public static char[][] nextMoveAI(char[][]board){
				int row = ThreadLocalRandom.current().nextInt(0, 10);
				int column = ThreadLocalRandom.current().nextInt(0, 10);
				if (board[row][column]== '0') {
					board[row][column] = 'x';
				}
				else {
					boolean loop = true;
					while(loop) {
						int[] edgeCase = again();
						row = edgeCase[0];
						column = edgeCase[1];
						if (board[row][column]== '0') {
							board[row][column] = 'x';
							break;
						}
						else {
							edgeCase = again();
							continue;
						}
					}
				}
				move = recordMove(row, column);
				return board;
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
			// Error case for if input already exists
			public static int[] again() {
				int[] input = getInput(scnr);
				input = interpreter(input[0], input[1]);
				return input;
				
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
			// Determines if there is a winner
			public static String chickenDinner(char[][] board) {
				String team = null;
				int row = move[0];
				int column = move[1];
				// Horizontal pattern
				if ((column<15)
						&&(board[row][column]==board[row][column+2])
						&&(board[row][column]==board[row][column+4])
						&&(board[row][column]==board[row][column+6])
				) {
					team = Character.toString(board[row][column]);
					return team;
				}
				// Vertical pattern
				else if ((row<8)
						&&(board[row][column]==board[row+1][column])
						&&(board[row][column]==board[row+2][column])
						&&(board[row][column]==board[row+3][column])
				) {
					team = Character.toString(board[row][column]);
					return team;
				}
				return team;
			}
			public static boolean chickenDinner(char[][] board) {
				boolean finished = false;
				int row = move[0];
				int column = move[1];
				// Horizontal pattern
				if ((column<15)
						&&(board[row][column]==board[row][column+2])
						&&(board[row][column]==board[row][column+4])
						&&(board[row][column]==board[row][column+6])
				) {
					finished = true;
					return finished;
				}
				// Vertical pattern
				else if ((row<8)
						&&(board[row][column]==board[row+1][column])
						&&(board[row][column]==board[row+2][column])
						&&(board[row][column]==board[row+3][column])
				) {
					finished = true;
					return finished;
				}
				return finished;
			}
			// Global vars
			public static int[] move = new int[2];
			public static Scanner scnr = new Scanner(System.in);
			// Main
			public static void main(String[] args) {
				char[][] board = gameBoard();
				int[] input;
				boolean play = true;
				int count = 0;
				printArray(board);
				// Play loop
				while(play){
					if (count % 2 == 0){
						input = getInput(scnr);
						input = interpreter(input[0], input[1]);
						board = nextMovePlayer(input[0],input[1],board);
					}
					else {
						board = nextMoveAI(board);
					}
					
					printArray(board);
					count= count +1;
					if (chickenDinner(board)!=null) {
						if(chickenDinner(board)=="R") {
							System.out.println("The red player won.");
						}
						else if(chickenDinner(board)=="Y") {
							System.out.println("Yellow won.");
						}
						play=false;
					}
				}
			}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
 * 
 * 
 * 
 */
}
