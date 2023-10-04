package synchronize2;

/**
 * Demonstrating inconsistent change due to concurrency
 */
public class Test {

	public static void main(String[] args) {
		
		Point p = new Point();
		
		ChangerThread t1 = new ChangerThread(p);
		ChangerThread t2 = new ChangerThread(p);
		
		t1.start();
		t2.start();
	}

}
