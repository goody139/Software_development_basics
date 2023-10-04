package synchronize2;

/**
 * Demonstrates the concurrent access to the Point coordinates
 * and a wrong synchronization on the monitor "this" in the run-method
 */
public class ChangerThread extends Thread {
	Point p;

	public ChangerThread(Point p) {
		this.p = p;
	}

	public void run() {

		// synchronization error: "this" as monitor in run():
		// this way, each thread will have a different monitor
		// (synchronization must be at the same monitor object)
		
		while (true) {
			  // Instead: try "p" as the monitor ... 				
	      synchronized (this) {  
				int x = (int) (Math.random() * 1000), y = x;
				
				p.x = x;
				p.y = y;

				int tx = p.x, ty = p.y;

				if (tx != ty) {
					System.err.printf("Concurrency problem despite synchronization (X != Y): p.x=%d p.y=%d%n", tx, ty);
				}
			}
		}
	}
}
