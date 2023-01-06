import java.util.Scanner;
import java.util.Arrays;
public class RemovesVowels {
	
	public static String[] removeVowels(String[] words) {
		if (words.length==1) {
			StringBuilder temp = new StringBuilder();
			String word = words[0];
			int j=0;
			temp.append(word);
			if (word.contains("a")) {
				j = word.indexOf("a");
				temp.deleteCharAt(j);
			}
			if (word.contains("A")) {	
				j = word.indexOf("A");
				temp.deleteCharAt(j);
			}	
			if (word.contains("e")) {
				j = word.indexOf("e");
				temp.deleteCharAt(j);
				
			}
			if(word.contains("E")){	
				j = word.indexOf("E");
				temp.deleteCharAt(j);
			}
			if(word.contains("i")) {
				j = word.indexOf("i");
				temp.deleteCharAt(j);
				
			}
			if (word.contains("I")) {
				j = word.indexOf("I");
				temp.deleteCharAt(j);
			}
			if (word.contains("o")) {
				j = word.indexOf("o");
				temp.deleteCharAt(j);
			}
			if (word.contains("O")) {
				j = word.indexOf("O");
				temp.deleteCharAt(j);
			}
			if (word.contains("u")) {
				j = word.indexOf("u");
				temp.deleteCharAt(j);
			}	
			if (word.contains("U")) {
				j = word.indexOf("U");
				temp.deleteCharAt(j);
			}
			words[0] = temp.toString();
		}
		return words;
		
	}
	public static String getUserInput(Scanner scnr) {
		System.out.println("Please enter in a phrase: ");
		String userInput = scnr.nextLine();
		return userInput;
	}
	public static String[] getWords(String userInput) {
		String[] words = userInput.split("\\W");
		return words;
	}
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] userInput = getWords(getUserInput(scnr));
		String[] result = removeVowels(userInput);
		String resultActual = Arrays.toString(result);
		System.out.println(resultActual);
	}

}
