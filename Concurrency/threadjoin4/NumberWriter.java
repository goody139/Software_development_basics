package threadjoin4;

/**
 * Write numbers
 */
public class NumberWriter extends Thread {
	
	public NumberWriter(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println(getName() + ": " + i);
			
			// also possible: waiting for itself
			// however, this would block the thread
//			try {
//				join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		System.out.println(getName() + ": end");
	}
}
