package threadconcurrentclassvar8;

/**
 * Demonstrating a concurrent access to a class variable 
 */
public class StartNumberWriter {
	
	public static void main(String[] args) {
		
		// create threads
		Thread t1 = new NumberWriter("Thread1");
		Thread t2 = new NumberWriter("Thread2");
		
		// start threads
		System.out.println("Thread1 starts");
		t1.start();
		
		System.out.println("Thread2 starts");
		t2.start();
	}
}
