package threadconcurrentaccess9;

/**
 * Demonstrates two threads which concurrently change a Point object
 */
public class Test {

	public static void main(String[] args) {
		
		Point p = new Point();
	
		// create two threads
		ChangerThread t1 = new ChangerThread(p);
		ChangerThread t2 = new ChangerThread(p);
		
		// start threads
		t1.start();
		t2.start();
	}
}
