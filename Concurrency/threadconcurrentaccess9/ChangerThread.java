package threadconcurrentaccess9;

/**
 * Thread which generates a random number.
 * This random number is used as new coordinate: both, X value and Y value are set
 *  resulting in always X = Y
 * After setting the coordinates, the current values are checked for equality.
 * In case X is not equal to Y anymore a message is produced.
 * The message shows the concurrent effect of two threads accessing the two variables.
 * The two coordinates may violate the X=Y requirement due to the concurrency.
 */
public class ChangerThread extends Thread{
	private Point p;
	
	public ChangerThread(Point p) {
		this.p = p;
	}
	
	public void run() {
		
		// infinite loop
		while(true) {
			// create random number and assign it to x and y
			int x = (int)(Math.random()*1000), y = x;
			
			// set both values / coordinates to the same value
			p.x = x;
			p.y = y;
			
			// query the coordinate values
			int tx = p.x, ty = p.y;
			
			// coordinate values still the same?
			if (tx!=ty) {
				System.err.printf("Concurrency problem (X != Y): p.x=%d p.y=%d%n",tx,ty);
			}  
//			else {
//				System.out.printf("p.x:%d = p.y:%d%n", tx, ty);
//			}
		}
	}
}
