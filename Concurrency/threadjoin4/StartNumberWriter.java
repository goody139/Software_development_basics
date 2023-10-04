package threadjoin4;

/**
 * Creates and starts threads and waits till these are terminated
 */
public class StartNumberWriter {

	public static void main(String[] args) {
		
		Thread t1 = new NumberWriter("Thread1");
		Thread t2 = new NumberWriter("Thread2");
		
		System.out.println("Thread1 starts");
		t1.start(); 
		
		System.out.println("Thread2 starts");
		t2.start();
		
		// wait for the threads (synchronize their termination)
		// without the following join, the main program/thread reaches the
		//  end statement before the threads terminated
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// synchronized output after both threads have terminated
		System.out.println("Program end");
	}
}
