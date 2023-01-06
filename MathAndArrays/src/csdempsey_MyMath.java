/*
 * Calvin S. Dempsey Jr
 * 
 * 20 October 2022
 * 
 * Comp 167 Sec 02
 * 
 * This is a program that re-implements certain functions from the math class/library
 * 
 */
public class csdempsey_MyMath {
	// declaration section of public static math vars
	public static double pi = 3.141592653589793;
	public static double piN = -1*pi;
	public static double epsilon = 10e-10;
	// a method that converts radians input to angle output
	public static double toDegrees(double angleRadians) {
		// return var
		double angleDegrees;
		// general angle used in the conversion algorithm
		double angleGeneric = 180.0;
		angleDegrees = (double)(angleGeneric * angleRadians)/pi; 
		return angleDegrees;
	}
	// a method that converts degrees input into radians output
	public static double toRadians(double angleDegrees) {
		// return var
		double angleRadians;
		// generic angle used in the conversion algorithm
		double angleGeneric = 180.0;
		angleRadians = (double)(angleDegrees*pi)/angleGeneric;
		return angleRadians;
	}
	// returns the absolute value of input
	public static double absoluteValue(double arbitraryNumber) {
		// return var
		double absoluteVal;
		// if given num in signature is negative, make it positive
		if (arbitraryNumber < 0 ) {
			absoluteVal = arbitraryNumber*(-1);
			// returns
			return absoluteVal;
		}
		else {
			// else if pos, return 
			return arbitraryNumber;
		}
	}
	// returns the min given two nums
	public static double minimum(double numOne, double numTwo) {
		// if num one is greater than or equal to num to, return num two
		if (numOne >= numTwo) {
			return numTwo;
		}
		else {
			// else num one
			return numOne;
		}
	}
	// returns the max given two nums
	public static double maximum(double numOne, double numTwo) {
		// if num one is greater than or equal to num two, return num one
		if (numOne >= numTwo) {
			return numOne;
		}
		else {
			// else num two
			return numTwo;
		}
	}
	// a pow method that returns the repr of a base to the power: 'superscript'
	public static double power(double base, int superScript) {
		// return var
		double result = 0;
		// if superscript is 0 then return 1
		if (superScript==0) {
			result = 1;
			return result;
		}
		// creates an array to store terms of the power sequence to be multiplied later in the code
		double[] powerArr = new double[superScript];
		// iterates for 0 to superscript
		for (int i =0; i<superScript; i+=1) {
			powerArr[i]= base;
		}
		// result starts from base
		result = powerArr[0];
		for(int i=1; i<powerArr.length;i+=1) {
			result *=base;
		}
		// ends at terms of superscript, then returns product
		return result;
	}
	// root method to calculates some number: number, to root: root
	public static double root(double number, int root) {
		// start with guess of 1
		double g = 1;
		// g' var declaration, g' will ultimately be the return var, note: it is mutated
		double gPrime = 0;
		// bool var to determine if further iterations are required
		boolean again = true;
		while(again) {
			// numerator
			double numerator = (power(g,root) - number);
			// denom
			double denominator = root*(power(g,(root-1)));
			// calculation for g'
			gPrime = g - (numerator/denominator);
			// var declaration for observing the change
			double delta = absoluteValue((gPrime-g));
			// if the change is less than the threshold for error, stop
			if (delta<epsilon) {
				break;
			}
			// else update g to equal g'
			g = gPrime;
			
		}
		return gPrime;
	}
	// recursive method that finds the gcd
	public static int gcd(int x, int y) {
		if (y==0) {
			return x;
		}
		if (x==0) {
			return y;
		}
		return gcd(y, x%y);
	}
	// recursive method that finds the lcm
	public static int lcm(int x, int y) {
		int numerator = x*y;
		int denominator = gcd(x,y);
		int result = numerator/denominator;
		return result;
	}
	// trig method that finds the sine repr of an angle
	public static double sine(double angle) {
		// note: piN represents negative pi
		// checker to see if the angle falls within the defined boundaries for sine
		while(angle < piN || angle > pi) {
			if (angle < piN) {
				angle +=(2*pi);
			}
			if (angle > pi) {
				angle -=(2*pi);
			}
		}
		// declaration of the negative angle squared var
		double negAngleSquared = (-1)*power(angle,2);
		// reference to given angle
		double t = angle;
		// checker bool to determine next iteration
		boolean loop = true;
		// declaration of instance i in the sum
		int i = 0;
		// declaration of var that follows the sum of i-th terms, return var
		double sum = angle;
		while (loop) {
			// denominator
			double denom = (((2*i)+3)*((2*i)+2));
			// fraction
			double fraction = negAngleSquared / denom;
			// declaration of var that observes the change in the sum 
			double delta = absoluteValue(t);
			// if change is less than the threshold of error, stop sums
			if(delta<epsilon) {
				break;
			}
			// else continue sums
			else {
				t *= fraction;
			}
			// sum term t
			sum+=t;
			i+=1;
		}
		return sum;
	}
	// trig method that finds the cosine repr of an angle
	public static double cosine(double angle) {
		// note: piN represents negative pi
		// checker to see if the angle falls within the defined boundaries for sine
		while(angle < piN || angle > pi) {
			if (angle < piN) {
				angle +=(2*pi);
			}
			if (angle > pi) {
				angle -=(2*pi);
			}
		}
		// declaration of the negative angle squared var
		double negAngleSquared = (-1)*power(angle,2);
		// reference to given angle
		double t = angle;
		// checker bool to determine next iteration
		boolean loop = true;
		// declaration of instance i in the sum
		int i = 0;
		// declaration of var that follows the sum of i-th terms, return var
		// for this taylor expansion, sum begins at 1 as opposed to 0 for sine
		double sum = 1;
		while (loop) {
			// denominator
			double denom = (((2*i)+2)*((2*i)+1));
			// fraction
			double fraction = negAngleSquared / denom;
			// declaration of var that observes the change in the sum 
			double delta = absoluteValue(t);
			// if change is less than the threshold of error, stop sums
			if(delta<epsilon) {
				break;
			}
			// else continue sums
			else {
				t *= fraction;
			}
			// sum term t to sum
			sum+=t;
			i+=1;
		}
		return sum;
	}
	// this method returns the tangent repr of an angle
	public static double tangent(double angle) {
		// tan is defined as sine / cosine
		// there is a one-two decimal place rounding 'error'
		// no error is present, I just didn't round cosine nor sine
		double tanAngle = sine(angle)/cosine(angle);
		return tanAngle;
	}
}
