/*
 * Calvin S. Dempsey Jr
 * 
 * 20 October 2022
 * 
 * Comp 167 Sec 02
 * 
 * This is a program that re-implements certain functions from the Array object-class
 * 
 */
public class csdempsey_MyArrays {
	// a pseudo index at method for the array class given an array and a range
	public static int linearSearch (int[] userArr, int key, int start, int end) {
		// if not found return -1
		int result = -1;
		// loop that iterates from start index to end (not inclusive of end)
		for (start++; start<end;) {
			int needle = userArr[start];
			// checks to see if needle is found
			if (needle == key) {
				result = start;
				// if found, stop
				break;
			}
		}
		return result;
	}
	// same as before, this time the entire array is searched and returns first found instance
	public static int linearSearch(int[] array, int key) {
		// if not found return -1
		int result = -1;
		// var to keep track of number of iterations
		int len = array.length;
		// iterate through the entire array from index 0 to len
		for(int i = 0; i<len; i+=1) {
			int needle = array[i];
			// checks to see if needle is found
			if (needle == key) {
				// i represents the index, so return i if found
				result = i;
				break;
			}
		}
		return result;
	}
	// method to check for equivalence of all elements found at index i, returns true if true, else false
	public static boolean equals(int[] left, int[] right) {
		// left array len
		int leftLen = left.length;
		// right array len
		int rightLen = right.length;
		int len;
		boolean result = true;
		// if then len of left is does not equal right, result is false
		if (leftLen != rightLen) {
			return false;
		}
		else {
			len = leftLen;
		}
		// null checker var for left array
		boolean containsNull = false;
		// searches left array for null elm
		for (int elm : left) {
			String temp = Integer.toString(elm);
			if (temp == null) {
				containsNull = true;
			}
		}
		// null checker var for right array
		boolean check = false;
		// searches right array for null elm
		for (int elm : right) {
			String temp = Integer.toString(elm);
			if (temp == null) {
				check = true;
			}
		}
		// if both null, returns true
		if (check&&containsNull) {
			return true;
		}
		// else false
		else if (!check&&containsNull){
			return false;
		}
		// else false
		else if (check&&!containsNull) {
			return false;
		}
		// finally iterates through both arrays to determine if each element at index i is equal
		// both right and left len are equivalent, len is assumed to be the len of both arrays
		// the loop searches from index i = 0 to last index (len)
		for(int i = 0; i < len; i+=1 ) {
			if (left[i]!=right[i]) {
				// result is finally used here in this part of the method to keep track of equivalence
				result = false;
				break;
			}
		}
		return result;
	}
	// this method fills an array within specified range with specified value, returns mutated array
	public static void fill(int[] array, int value, int start, int end) {
		// for specified start to given end, loop iterates to mutate each element through given range
		for (int i = start; i<end; i+=1) {
			array[i] = value;
		}
	}
	// same as the above method, however this time it fills the entire array, returns mutated array
	public static void fill(int[] array, int value) {
		// var of the len of array
		int len = array.length;
		// for len of array, mutate each element to match value
		for (int i = 0; i<len; i+=1) {
			array[i] = value;
		}
	}
	// develops and returns a copy of an array within specified range
	public static int[] copyOf(int[] array, int fromIndex, int toIndex) {
		// len var
		int length = (toIndex-1) - fromIndex;
		// return array
		int[] result = new int[length];
		int i = 0;
		// iterate from start to end (not-inclusive) append element at index i to result at i
		for (++fromIndex; fromIndex<toIndex;) {
			result[i] = array[fromIndex];
			i+=1;
		}
		return result;
	}
	// does the same as the above; however, copies and returns the entire array
	public static int[] copyOf(int[] array) {
		// len var
		int length = array.length-1;
		// return array
		int[] result = new int[length];
		int i = 0;
		// enhanced for-loop that pulls each elm and appends it to result at index i
		for (int element : array) {
			result[i] = element;
			i+=1;
		}
		return result;
	}
	// sorts an array in specified range from least to greatest
	public static void sort(int[] array, int fromIndex, int toIndex) {
		// iterates from start to end
		for (int i = fromIndex; i<toIndex; i+=1) {
			// stops if end of range is reached
			if(i==(toIndex-1)){			
				break;
			}
			else {
				// defines len given position in range
				int length = toIndex-i;
				// defines min as the current element at index i, mutable
				int min = array[i];
				// temp is a reference of the position i, without mutating i
				int temp = i;
				// nested for-loop that swaps min var when applicable
				for (int j = 0; j<length; j+=1) {
					if (min>array[temp]) {
						min = array[temp];
					}
					temp+=1;
				}
				// finds the index of min
				int index = linearSearch(array,min);
				// swaps the position of the min elm with the original elm at i
				array[index] = array[i];
				array[i] = min;
			}
		}
	}
	// sorts an array from least to greatest
	public static void sort(int[] array) {
		// iterates for length of array
		for (int i = 0; i<array.length; i+=1) {
			// breaks if end of range is detected 
			if (i==array.length-1) {
				break;
			}
			else {
				// min is set as the current elm
				int min = array[i];
				// temp is a reference of the position i, without mutating i
				int temp = i;
				// iterates from i to len of array
				for (int j = i ;j<array.length; j+=1) {
					// if a val less than min is detected, min is redefined
					if (min>array[temp]) {
						min = array[temp];
					}
					temp+=1;
				}
				// finds the index of min
				int index = linearSearch(array,min);
				// swaps the position of the min elm with the original elm at i
				array[index] = array[i];
				array[i] = min;
			}
		}
	}
	// a function that converts an integer array to a string repr of the contents of that array
	public static String toString(int[] array) {
		if (array == null) {
			return null;
		}
		else {
			StringBuilder mutableResult = new StringBuilder();
			mutableResult.append("[");
			int i = 0;
			int length = array.length-1;
			for (int element : array) {
				String temp = element + "";
				if (i!=length) {
					mutableResult.append(temp + ", ");
				}
				else {
					mutableResult.append(temp);
				}
				i+=1;
			}
			mutableResult.append("]");
			String result = mutableResult.toString();
			return result;
		}
	}
}
