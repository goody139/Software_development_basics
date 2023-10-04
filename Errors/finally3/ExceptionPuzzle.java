package finally3;

/**
 * Exception handling with try/catch and finally
 */
public class ExceptionPuzzle {
	
	public int puzzle1(boolean b) {
		try {
			if (b)
				return 10/0;  // Division with 0 => Exception
			else
				return 4711;
		} catch (Exception e) {
			System.err.println("Exception has been thrown");
			// System.exit(10); // able to circumvent "finally"
			int i = 10/0;  // exception within the catch block
			return i;
		}  finally {
			System.out.println("finally says hi");
			return 42; // exception in the catch block gets lost, and
			           // overwrites return values including 
			           // the second exception in the case b=true
		}
	}
	
}
