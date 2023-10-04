package finally2;

/**
 * Exception handling with try/catch and finally
 */
public class ExceptionPuzzle {
	
	public int puzzle1(boolean b) {
		try {
			if (b)
				return 10/0;		// Division by 0 => Exception
			else
				return 4711;
		} catch (Exception e) {
			System.err.println("Exception has been thrown");
		} finally {    // processed in both cases
			return 42; // overwrites return value also in the b=false case
		}
	}
	
}
