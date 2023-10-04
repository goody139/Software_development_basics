package threaddaemon6;

/**
 * Demonstration of daemon threads
 */
public class StartNumberWriter {

	public static void main(String[] args) {
		
		// create threads
		Thread t1 = new NumberWriter("Thread1");
		Thread t2 = new NumberWriter("Thread2");
		
		// make of each a daemon thread
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		System.out.println("Thread1 starts");
		t1.start();
		
		// change daemon property after thread start: leads to IllegalThreadStateException
//		t1.setDaemon(false);
		
		System.out.println("Thread2 starts");
		t2.start();
		
		// end of program (thread main) will terminate all daemon threads too
		System.out.println("Program end");
	}
}
