package threaddaemon6;

/**
 * Thread to write numbers
 */
public class NumberWriter extends Thread{
	
	public NumberWriter(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println(getName() + ": " + i);
			
			try {
			  sleep(1);
  		    } catch (InterruptedException e) {
			    System.err.println(getName() + ": I have been interrupted");
			    e.printStackTrace();
		    }
		}
		System.err.println(getName()+ ": I'm ending now ... ");
	}
}
