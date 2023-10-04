package finally2;

/**
 * demonstrates the return / finally problem
 */
public class MyFileTest {

	public static void main(String[] args) {
		
		ExceptionPuzzle p = new ExceptionPuzzle();

		// print return values of p.puzzle1:
		System.out.println("Puzzle1(true): "+ p.puzzle1(true));
		
	    // System.out.println("Puzzle1(false): "+ p.puzzle1(false));
	}

}
