package cast3;

public class PrimitiveDatentypes {

	public static void main(String[] args) {
		short s1 = 1, s2 = 2;
		byte b1 = 1, b2 = 2;
		int i1 = 1, i2 = 2;
		long l1 = 1, l2 = 2;

		int i = s1; // widening 
		
		// short s3 = s1 + s2;	// compiler error (internal calculation is with int)
		// byte b3 = b1 + b2;   // same as with short

		short s4 = (short) (s1 + s2); 
		byte b4 = (byte) (b1 + b2);
		
		// no problems with these:
		int i3 = i1 + i2;
		long l3 = l1 + l2;
		
		// internal calculation is with int; implicit cast for the internal calculation 
		// assignment with implicit cast to short is impossible as it is narrowing (from int to short)
		// short s5 = b1 + s2;
		
		// internal calculation is with long; implicit casts as above
		// int i3 = l1 + s1;
	}

}
