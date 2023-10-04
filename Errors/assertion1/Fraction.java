package assertion1;

/**
 * Class Fraction to demonstrate assertions
 */
public class Fraction {
	private int numerator; // Zaehler

	private int denominator; // Nenner


	public Fraction(double doubleno) {

		// to avoid rounding errors we convert into a String
		String ds = "" + doubleno;

		// split the String at the dot
		// the dot is a special character in the split
		// therefore, using an arbitrary character (here: "p")
		ds = ds.replace(".", "p");
		String[] sa = ds.split("p");

		// determine numerator and denominator
		denominator = (int) Math.pow(10, sa[1].length());
		numerator = (int) (doubleno * denominator);

		// cancel the fraction down
		int factor = gcd(numerator, denominator);
		denominator /= factor;
		numerator /= factor;
		
		// this to test the assertion:
		denominator = 0;
		 
		// 1.
		// assertion to check denominator (should be != 0)
		// if true: everything is fine

		assert denominator != 0 : "Division by 0!";

		// 2.
		// this to test the second assertion below:
		// denominator *= 0.1;
		
		// test the result for rounding errors
		// assert 1.0 * numerator / denominator == doubleno : "Rounding Error!";
	}

    // fraction as String
	public String toString() {
		return numerator + " / " + denominator + " = " + (1.0 * numerator / denominator);
	}

	
	// greatest common divisor (Euclid) 
	private static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
	}
}
