package shutdownhook1;

/**
 * Demonstration of the ShutdownHook thread.
 * If the program is terminated with Ctrl + C or the program stops normally
 * the ShutdownHook thread will be processed.
 */
public class Test {

	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		
		// Get the current Java Runtime-Object and hook
		// a ShutdownHook thread to it 
		Thread t = new MyEndThread();
		Runtime.getRuntime().addShutdownHook(t);
		
		// infinite loop (the alternative loop: while(true) would be rejected by the compiler)
		// Ctrl + C to end the following infinite loop will make the Runtime call the ShutdownHook thread
//		while(i == j) {		
//		}

		System.out.println("Program end");
	}

}
