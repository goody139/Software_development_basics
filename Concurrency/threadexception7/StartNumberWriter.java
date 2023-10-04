package threadexception7;

/**
 * Demonstrates the UncaughtExceptionHandler.
 */
public class StartNumberWriter {

	public static void main(String[] args) {
		
		Thread t1 = new NumberWriter("Thread1");
		Thread t2 = new NumberWriter("Thread2");
		
		t1.setUncaughtExceptionHandler(new MyExceptionHandler("Thread1"));
		t2.setUncaughtExceptionHandler(new MyExceptionHandler("Thread2"));
		
//		Thread.setDefaultUncaughtExceptionHandler(new MyExceptionHandler("DefaultHandler"));
		
		System.out.println("Thread1 starts");
		t1.start();

		System.out.println("Thread2 starts");
		t2.start();
	}
}
