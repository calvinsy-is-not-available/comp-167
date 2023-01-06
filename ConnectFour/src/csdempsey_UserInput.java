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
 * 				This module collects input from the user. 
 * 				There are many conditions which address edge cases to retrieve desired input.
 */

public class csdempsey_UserInput {
	// Gets input
		public static int[] getInput(Scanner scnr) {
			int[] returnArray = new int[2];
			System.out.println("Please choose your row. Choices are 0-9.");
			System.out.println();
			boolean loop = true;
			int row = 0;
			// enters loop to determine if user row is formatted correctly. Does not end until correct format is entered
			while(loop) {
				String input = scnr.next();           
				try { 
					row = Integer.parseInt(input); 
					if (row>9||row<0) { 
						boolean bool = true;
						while(bool) {
							System.out.println("Error: Number Exceeds the bounds, please enter a new number:");
							System.out.println();
							System.out.println("Please choose your row. Choices are 0-9.");
							System.out.println();
							row = scnr.nextInt();
							if(row<10&&row>-1) {
								bool = false;
							}
						}
					}
					System.out.println("row " + row + " sucessfully recorded.");
					System.out.println();
					break;
				}  
				catch (NumberFormatException e) { 
					System.out.println(input + " is not a valid integer"); 
					System.out.println("Please input an integer");
				} 
			}
			System.out.println("Please choose your column. Choices are 0-9.");
			System.out.println();
			int col = 0;
			// enters loop to determine if user column is formatted correctly. Does not end until correct format is entered
			while(loop) {
				String input = scnr.next();           
				try { 
					col = Integer.parseInt(input); 
					if (col>9||col<0) { 
						boolean bool = true;
						while(bool) {
							System.out.println("Error: Number Exceeds the bounds, please enter a new number:");
							System.out.println();
							System.out.println("Please choose your column. Choices are 0-9.");
							System.out.println();
							col = scnr.nextInt();
							if(col<10&&col>-1) {
								bool = false;
							}
						}
					}
					System.out.println("column " + input + " sucessfully recorded.");
					System.out.println();
					break;
				}  
				catch (NumberFormatException e) { 
					System.out.println(col + " is not a valid integer"); 
					System.out.println("Please input an integer");
				} 
			}
			returnArray[0] = row;
			returnArray[1] = col;
			return returnArray;
		}
}
