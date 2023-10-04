package threadpriority5;

/**
 * Thread to write numbers
 */
public class NumberWriter extends Thread{
	
	public NumberWriter(String name) {
		setName(name);
	}
	
	
	public void run() {
		for(int i = 0; i<20; i++) {
			System.out.println(getName() + ": " + i);
			
			try {
			  sleep(1000);
  		    } catch (InterruptedException e) {
			    System.err.println(getName() + ": I have been interrupted");
			    e.printStackTrace();
		    }
		}
		System.err.println(getName()+ ": I'm ending now ... ");
	}
}
