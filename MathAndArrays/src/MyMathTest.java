import java.util.Scanner;

public class MyMathTest {
	private static void testToDegrees(Scanner keyboard) {
		double angle;
		
		System.out.println("Test: double toDegrees(double)");
		System.out.print("  Enter an angle in radians: ");
		angle = keyboard.nextDouble();
		System.out.println("  The equivalent angle in degrees is: " +
			csdempsey_MyMath.toDegrees(angle));
		System.out.println();
	}
	
	private static void testToRadians(Scanner keyboard) {
		double angle;
		
		System.out.println("Test: double toRadians(double)");
		System.out.print("  Enter an angle in degrees: ");
		angle = keyboard.nextDouble();
		System.out.println("  The equivalent angle in radians is: " +
				csdempsey_MyMath.toRadians(angle));
		System.out.println();
	}
	
	private static void testAbsoluteValue(Scanner keyboard) {
		double v;
		
		System.out.println("Test: double toAbsoluteValue(double)");
		System.out.print("  Enter a value v: ");
		v = keyboard.nextDouble();
		System.out.println("  The absolute value of v is: " +
				csdempsey_MyMath.absoluteValue(v));
		System.out.println();
	}
	
	private static void testMinimum(Scanner keyboard) {
		double x;
		double y;
		
		System.out.println("Test: double minimum(double, double)");
		System.out.print("  Enter a real number: ");
		x = keyboard.nextDouble();
		System.out.print("  Enter another real number: ");
		y = keyboard.nextDouble();
		System.out.println("  The smaller of the two values is " +
				csdempsey_MyMath.minimum(x, y));
		System.out.println();
	}
	
	private static void testMaximum(Scanner keyboard) {
		double x;
		double y;
		
		System.out.println("Test: double maximum(double, double)");
		System.out.print("  Enter a real number: ");
		x = keyboard.nextDouble();
		System.out.print("  Enter another real number: ");
		y = keyboard.nextDouble();
		System.out.println("  The larger of the two values is " +
				csdempsey_MyMath.maximum(x, y));
		System.out.println();
	}

	private static void testPower(Scanner keyboard) {
		double base;
		int exponent;
		
		System.out.println("Test: double power(double, int)");
		System.out.print("  Enter a real number base: ");
		base = keyboard.nextDouble();
		System.out.print("  Enter an integer exponent: ");
		exponent = keyboard.nextInt();
		System.out.println("  The base raised to the power exponent is: " +
				csdempsey_MyMath.power(base, exponent));
		System.out.println();
	}
	
	private static void testRoot(Scanner keyboard) {
		double x;
		int root;
		
		System.out.println("Test: double root(double, int)");
		System.out.print("  Enter a real number x: ");
		x = keyboard.nextDouble();
		System.out.print("  Enter an integer root: ");
		root = keyboard.nextInt();
		System.out.println("  x ^ (1/" + root + "): " +
				csdempsey_MyMath.root(x, root));
		System.out.println();
	}
	
	private static void testGCD(Scanner keyboard) {
		int a;
		int b;
		
		System.out.println("Test: int gcd(int, int)");
		System.out.print("  Enter an integer: ");
		a = keyboard.nextInt();
		System.out.print("  Enter another integer: ");
		b = keyboard.nextInt();
		System.out.println("The greatest common divisor of these two " +
			"integers is: " + csdempsey_MyMath.gcd(a, b));
		System.out.println();
	}
	
	private static void testLCM(Scanner keyboard) {
		int a;
		int b;
		
		System.out.println("Test: int lcm(int, int)");
		System.out.print("  Enter an integer: ");
		a = keyboard.nextInt();
		System.out.print("  Enter another integer: ");
		b = keyboard.nextInt();
		System.out.println("The least common multiple of these two " +
			"integers is: " + csdempsey_MyMath.lcm(a, b));
		System.out.println();
	}
	
	private static void testSine(Scanner keyboard) {
		double angle;
		
		System.out.println("Test: double sine(double)");
		System.out.print("  Enter an angle in radians: ");
		angle = keyboard.nextDouble();
		System.out.println("  The sine of this angle is: " +
				csdempsey_MyMath.sine(angle));
		System.out.println();
	}
	
	private static void testCosine(Scanner keyboard) {
		double angle;
		
		System.out.println("Test: double cosine(double)");
		System.out.print("  Enter an angle in radians: ");
		angle = keyboard.nextDouble();
		System.out.println("  The cosine of this angle is: " +
				csdempsey_MyMath.cosine(angle));
		System.out.println();
	}
	
	private static void testTangent(Scanner keyboard) {
		double angle;
		
		System.out.println("Test: double tangent(double)");
		System.out.print("  Enter an angle in radians: ");
		angle = keyboard.nextDouble();
		System.out.println("  The tangent of this angle is: " +
				csdempsey_MyMath.tangent(angle));
		System.out.println();
	}
	
	public static void main(String[] args) {
		final int TEST_TO_DEGREES = 1;
		final int TEST_TO_RADIANS = 2;
		final int TEST_ABSOLUTE_VALUE = 3;
		final int TEST_MINIMUM = 4;
		final int TEST_MAXIMUM = 5;
		final int TEST_POWER = 6;
		final int TEST_ROOT = 7;
		final int TEST_GCD = 8;
		final int TEST_LCM = 9;
		final int TEST_SINE = 10;
		final int TEST_COSINE = 11;
		final int TEST_TANGENT = 12;
		final int QUIT = 13;
		
		Scanner keyboard = new Scanner(System.in);
		boolean stop;
		int choice;
		
		stop = false;
		while(!stop) {
			System.out.println("Choose a method to test: ");
			System.out.println(TEST_TO_DEGREES +
				".  double toDegrees(double)");
			System.out.println(TEST_TO_RADIANS +
				".  double toRadians(double)");
			System.out.println(TEST_ABSOLUTE_VALUE +
				".  double absoluteValue(double)");
			System.out.println(TEST_MINIMUM +
				".  double minimum(double, double)");
			System.out.println(TEST_MAXIMUM +
				".  double maximum(double, double)");
			System.out.println(TEST_POWER +
				".  double power(double, int)");
			System.out.println(TEST_ROOT +
				".  double root(double, int)");
			System.out.println(TEST_GCD +
				".  int gcd(int, int)");
			System.out.println(TEST_LCM +
				".  int lcm(int, int)");
			System.out.println(TEST_SINE +
				". double sine(double)");
			System.out.println(TEST_COSINE +
				". double cosine(double)");
			System.out.println(TEST_TANGENT +
				". double tangent(double)");
			System.out.println(QUIT + ". (Exit)");
			
			System.out.print("Your choice: ");
			choice = keyboard.nextInt();
			while (choice < TEST_TO_DEGREES || choice > QUIT) {
				System.out.print("Invalid entry. Please enter again: ");
					choice = keyboard.nextInt();
				}
				System.out.println();
				
				if (choice == TEST_TO_DEGREES) {
					testToDegrees(keyboard);
				} else if (choice == TEST_TO_RADIANS) {
					testToRadians(keyboard);
				} else if (choice == TEST_ABSOLUTE_VALUE) {
					testAbsoluteValue(keyboard);
				} else if (choice == TEST_MINIMUM) {
					testMinimum(keyboard);
				} else if (choice == TEST_MAXIMUM) {
					testMaximum(keyboard);
				} else if (choice == TEST_POWER) {
					testPower(keyboard);
				} else if (choice == TEST_ROOT) {
					testRoot(keyboard);
				} else if (choice == TEST_GCD) {
					testGCD(keyboard);
				} else if (choice == TEST_LCM) {
					testLCM(keyboard);
				} else if (choice == TEST_SINE) {
					testSine(keyboard);
				} else if (choice == TEST_COSINE) {
					testCosine(keyboard);
				} else if (choice == TEST_TANGENT) {
					testTangent(keyboard);
				} else {
					stop = true;
				}
			}
		}
	}

