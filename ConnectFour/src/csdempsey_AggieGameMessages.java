/**
	 * Name: Calvin S. Dempsey Jr, username: csdempsey
	 * 
	 * Date: 10/2/2022
	 * 
	 * Class Section: COMP 167 Sec. 02
	 * 
	 * Description: A psuedo-connect four game. When four consecutive x's are detected, in any direction, a winner is pronounced.
	 * 				Game is either single-player (PvAI) or two-player (PvP).
	 * 				This module simply prints welcome and exit messages. 
	 */

public class csdempsey_AggieGameMessages {
	public static void welcomeMessage() {
		System.out.println("Welcome to Aggie Game: an interpretation of Connect Four.");
	}
	public static void welcomeMessageTwo() {
		System.out.print("Preparing game...");
		// generates psuedo-dynamic loading ellipsis
		int i = csdempsey_AggieGameBizRuls.random.nextInt(1000+1);
		while(i>0) {
			if(500%i==0) {
				System.out.print(".");
			}
			i-=10;
		}
		System.out.println();
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
}
