package thread1;

/**
 * Demonstration of the run-method
 * Creates two threads but initiates only run() on them (instead of start()) 
 * Therefore, the threads are not really activated (not running concurrently)
 */
public class RunNumberWriter {

	public static void main(String[] args) {
		Thread t1 = new NumberWriter("Thread1");
		Thread t2 = new NumberWriter("Thread2");
		
		System.out.println("Thread1 is working");
		t1.run();	// method run is processed but not within a real concurrent thread
		
		System.out.println("Thread2 is working");
		t2.run();	// method run is processed (no thread)
		
		System.out.println("Program end");
	}

}
