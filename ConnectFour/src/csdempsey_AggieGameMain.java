public class csdempsey_AggieGameMain {

	
	/**
	 * Name: Calvin S. Dempsey Jr, username: csdempsey
	 * 
	 * Date: 10/2/2022
	 * 
	 * Class Section: COMP 167 Sec. 02
	 * 
	 * Description: A psuedo-connect four game. When four consecutive x's are detected, in any direction, a winner is pronounced.
	 * 				Game is either single-player (PvAI) or two-player (PvP).
	 * 				This module uses all methods in this project to spear-head Aggie Game.
	 */
	
	// Main
	public static void main(String[] args) {
		// calls all the things that are required to set the game up
		char[][] board = csdempsey_AggieGameBizRuls.gameBoard();
		int[] input;
		boolean play = true;
		int count = 0;
		// Prints welcome messages
		csdempsey_AggieGameMessages.welcomeMessage();
		// a var to check if user selected multiplayer option
		boolean mode_two_people = csdempsey_AggieGameBizRuls.multiplayer();
		csdempsey_AggieGameMessages.welcomeMessageTwo();
		csdempsey_AggieGameBizRuls.printArray(board);
		// Play loop
		while(play){
			if (csdempsey_AggieGameBizRuls.chickenDinner(board)) {
				csdempsey_AggieGameMessages.endMessage();
				if (mode_two_people) {
					// if even, the last player was player two
					if (count % 2 == 0) {
						System.out.println("Player Two placed the last x");
						System.out.println("Therefore Player Two wins");
						csdempsey_AggieGameMessages.endMessageTwo();
					}
					// else player one
					else {
						System.out.println("Player One placed the last x");
						System.out.println("Therefore, Player One wins");
						csdempsey_AggieGameMessages.endMessageTwo();
					}
				}
				else {
					csdempsey_AggieGameMessages.endMessageTwo();
				}
				break;
			}
			if(mode_two_people) {
				// multiplayer mode
				if (count % 2 == 0){
					input = csdempsey_UserInput.getInput(csdempsey_AggieGameBizRuls.scnr);
					input = csdempsey_AggieGameBizRuls.interpreter(input[0], input[1]);
					board = csdempsey_AggieGameBizRuls.nextMovePlayer(input[0],input[1],board);
					System.out.println("Player Two Board:");
				}
				else {
					input = csdempsey_UserInput.getInput(csdempsey_AggieGameBizRuls.scnr);
					input = csdempsey_AggieGameBizRuls.interpreter(input[0], input[1]);
					board = csdempsey_AggieGameBizRuls.nextMovePlayer(input[0],input[1],board);
					System.out.println("Player One Board:");
				}
				csdempsey_AggieGameBizRuls.printArray(board);
				count = count +1;
			}
			else {
				// single player mode
				if (count % 2 == 0){
					input = csdempsey_UserInput.getInput(csdempsey_AggieGameBizRuls.scnr);
					input = csdempsey_AggieGameBizRuls.interpreter(input[0], input[1]);
					board = csdempsey_AggieGameBizRuls.nextMovePlayer(input[0],input[1],board);
					System.out.println("Your board:");
					System.out.println();
				}
				else {
					// computer's turn
					board = csdempsey_AggieGameBizRuls.nextMoveAI(board);
					System.out.println();
				}
				csdempsey_AggieGameBizRuls.printArray(board);
				count = count +1;
			}
		}
	}
}
