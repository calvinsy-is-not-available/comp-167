import java.util.Scanner;

public class MyArraysTest {
	public static int[] readArray(Scanner keyboard, String spacing) {
		int[] array;
		int size;
		
		System.out.print(spacing + "Enter the size of the new array: ");
		size = keyboard.nextInt();
		
		array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.print(spacing +
				"Enter the value at position " + i + ": ");
			array[i] = keyboard.nextInt();
		}
		return array;
	}
	
	public static void testLinearSearchRange(Scanner keyboard) {
		int[] array;
		int key;
		int fromIndex;
		int toIndex;
		int position;
		
		System.out.println("Test: int linearSearch(int[], int, int, int)");
		System.out.println("  Enter an array of int: ");
		array = readArray(keyboard, "    ");
		System.out.print("  Enter the value to search for: ");
		key = keyboard.nextInt();
		System.out.print("  Enter the starting index: ");
		fromIndex = keyboard.nextInt();
		System.out.print("  Enter the end index: ");
		toIndex = keyboard.nextInt();
		
		position = csdempsey_MyArrays.linearSearch(array, key, fromIndex, toIndex);
		if (position != -1) {
			System.out.println("  This value occurs in the array " +
				"at position " + position);
		} else {
			System.out.println("  This value does not occur in the array");
		}
	}

	public static void testLinearSearchFull(Scanner keyboard) {
		int[] array;
		int key;
		int position;
		
		System.out.println("Test: int linearSearch(int[], int)");
		System.out.println("  Enter an array of int: ");
		array = readArray(keyboard, "    ");
		System.out.print("  Enter the value to search for: ");
		key = keyboard.nextInt();
		
		position = csdempsey_MyArrays.linearSearch(array, key);
		if (position != -1) {
			System.out.println("  This value occurs in the array " +
				"at position " + position);
		} else {
			System.out.println("  This value does not occur in the array");
		}
	}

	public static void testEquals(Scanner keyboard) {
		int[] left;
		int[] right;
		
		System.out.println("Test: boolean equals(int[], int[])");
		System.out.println("  Enter an array of int:");
		left = readArray(keyboard, "    ");
		System.out.println("  Enter another array of int:");
		right = readArray(keyboard, "    ");
		
		if (csdempsey_MyArrays.equals(left, right)) {
			System.out.println("  The two arrays are equal");
		} else {
			System.out.println("  The two arrays are not equal");
		}
	}

	public static void testFillRange(Scanner keyboard) {
		int[] array;
		int value;
		int fromIndex;
		int toIndex;
		
		System.out.println("Test: int fill(int[], int, int, int)");
		System.out.println("  Enter an array of int: ");
		array = readArray(keyboard, "    ");
		System.out.print("  Enter the value to fill the array with: ");
		value = keyboard.nextInt();
		System.out.print("  Enter the starting index: ");
		fromIndex = keyboard.nextInt();
		System.out.print("  Enter the end index: ");
		toIndex = keyboard.nextInt();
		
		csdempsey_MyArrays.fill(array, value, fromIndex, toIndex);
		
		System.out.println("  The modified array is: " +
				csdempsey_MyArrays.toString(array));
	}

	public static void testFillFull(Scanner keyboard) {
		int[] array;
		int value;
		
		System.out.println("Test: int fill(int[], int)");
		System.out.println("  Enter an array of int: ");
		array = readArray(keyboard, "    ");
		System.out.print("  Enter the value to fill the array with: ");
		value = keyboard.nextInt();
		
		csdempsey_MyArrays.fill(array, value);
		
		System.out.println("  The modified array is: " +
				csdempsey_MyArrays.toString(array));
	}

	public static void testCopyOfRange(Scanner keyboard) {
		int[] array;
		int[] copy;
		int fromIndex;
		int toIndex;
		
		System.out.println("Test: int copyOf(int[], int, int)");
		System.out.println("  Enter an array of int: ");
		array = readArray(keyboard, "    ");
		System.out.print("  Enter the starting index: ");
		fromIndex = keyboard.nextInt();
		System.out.print("  Enter the end index: ");
		toIndex = keyboard.nextInt();
		
		copy = csdempsey_MyArrays.copyOf(array, fromIndex, toIndex);
		
		System.out.println("  The copied array is: " +
				csdempsey_MyArrays.toString(copy));
	}

	public static void testCopyOfFull(Scanner keyboard) {
		int[] array;
		int[] copy;
		
		System.out.println("Test: int copyOf(int[])");
		System.out.println("  Enter an array of int: ");
		array = readArray(keyboard, "    ");
		
		copy = csdempsey_MyArrays.copyOf(array);
		
		System.out.println("  The copied array is: " +
				csdempsey_MyArrays.toString(copy));
		
	}

	public static void testSortRange(Scanner keyboard) {
		int[] array;
		int fromIndex;
		int toIndex;
		
		System.out.println("Test: int sort(int[], int, int)");
		System.out.println("  Enter an array of int: ");
		array = readArray(keyboard, "    ");
		System.out.print("  Enter the starting index: ");
		fromIndex = keyboard.nextInt();
		System.out.print("  Enter the end index: ");
		toIndex = keyboard.nextInt();
		
		csdempsey_MyArrays.sort(array, fromIndex, toIndex);
		
		System.out.println("  The partially sorted array is: " +
				csdempsey_MyArrays.toString(array));
	}

	public static void testSortFull(Scanner keyboard) {
		int[] array;
		
		System.out.println("Test: int sort(int[])");
		System.out.println("  Enter an array of int: ");
		array = readArray(keyboard, "    ");
		
		csdempsey_MyArrays.sort(array);
		
		System.out.println("  The sorted array is: " +
				csdempsey_MyArrays.toString(array));
	}
	
	public static void testToString(Scanner keyboard) {
		int[] array;
		
		System.out.println("Test: String toString(int[])");
		System.out.println("  Enter an array of int: ");
		array = readArray(keyboard, "    ");
		
		System.out.println("  The array you entered is: " +
				csdempsey_MyArrays.toString(array));
	}
	
	public static void main(String[] args) {
		final int TEST_LINEAR_SEARCH_RANGE = 1;
		final int TEST_LINEAR_SEARCH_FULL = 2;
		final int TEST_EQUALS = 3;
		final int TEST_FILL_RANGE = 4;
		final int TEST_FILL_FULL = 5;
		final int TEST_COPY_OF_RANGE = 6;
		final int TEST_COPY_OF_FULL = 7;
		final int TEST_SORT_RANGE = 8;
		final int TEST_SORT_FULL = 9;
		final int TEST_TO_STRING = 10;
		final int QUIT = 11;
		
		Scanner keyboard = new Scanner(System.in);
		boolean stop;
		int choice;
		
		stop = false;
		while(!stop) {
			System.out.println("Choose a method to test: ");
			System.out.println(TEST_LINEAR_SEARCH_RANGE +
				".  int linearSearch(int[], int, int, int)");
			System.out.println(TEST_LINEAR_SEARCH_FULL +
				".  int linearSearch(int[], int)");
			System.out.println(TEST_EQUALS +
				".  boolean equals(int[], int[])");
			System.out.println(TEST_FILL_RANGE +
				".  void fill(int[], int, int, int)");
			System.out.println(TEST_FILL_FULL +
				".  void fill(int[], int)");
			System.out.println(TEST_COPY_OF_RANGE +
				".  int[] copyOf(int[], int, int)");
			System.out.println(TEST_COPY_OF_FULL +
				".  int[] copyOf(int[])");
			System.out.println(TEST_SORT_RANGE +
				". void sort(int[], int, int)");
			System.out.println(TEST_SORT_FULL +
				". void sort(int[])");
			System.out.println(TEST_TO_STRING +
				". String toString(int[])");
			System.out.println(QUIT + ". (Exit)");
			
			System.out.print("Your choice: ");
			choice = keyboard.nextInt();
			while (choice < TEST_LINEAR_SEARCH_RANGE ||
				choice > QUIT) {
				System.out.print("Invalid entry. Please enter again: ");
				choice = keyboard.nextInt();
			}
			System.out.println();
			
			if (choice == TEST_LINEAR_SEARCH_RANGE) {
				testLinearSearchRange(keyboard);
			} else if (choice == TEST_LINEAR_SEARCH_FULL) {
				testLinearSearchFull(keyboard);
			} else if (choice == TEST_EQUALS) {
				testEquals(keyboard);
			} else if (choice == TEST_FILL_RANGE) {
				testFillRange(keyboard);
			} else if (choice == TEST_FILL_FULL) {
				testFillFull(keyboard);
			} else if (choice == TEST_COPY_OF_RANGE) {
				testCopyOfRange(keyboard);
			} else if (choice == TEST_COPY_OF_FULL) {
				testCopyOfFull(keyboard);
			} else if (choice == TEST_SORT_RANGE) {
				testSortRange(keyboard);
			} else if (choice == TEST_SORT_FULL) {
				testSortFull(keyboard);
			} else if (choice == TEST_TO_STRING) {
				testToString(keyboard);
			} else {
				stop = true;
			}
			System.out.println();
		}
	}
}
