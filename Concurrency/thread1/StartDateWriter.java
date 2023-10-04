package thread1;

/**
 * Creates two Runnable objects which are given to two thread instances (as argument)
 * Besides subclassing the class Thread, this is the second alternative to
 * realize own thread functionality
 */
public class StartDateWriter {

	public static void main(String[] args) {
		
		// create Runnables
		DateWriter d1 = new DateWriter("Runnable1");
		DateWriter d2 = new DateWriter("Runnable2");
		
		// wrapping Runnables as threads (Runnables are the arguments to thread constructors)
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		
		// start the new threads
		System.out.println("Thread1 starts");
		t1.start();

		System.out.println("Thread2 starts");
		t2.start();
		
		System.out.println("Program end");
	}

}
