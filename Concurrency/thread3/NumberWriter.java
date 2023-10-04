package thread3;

import java.util.concurrent.TimeUnit;

/**
 * thread with number output and phases when it sleeps
 */
public class NumberWriter extends Thread{
	
	private boolean wasInterrupted = false;
	
	public NumberWriter(String name) {
		setName(name);
	}
	
	public void run() {

		// loop ends either - with i reaching the limit
		//                  - with interrupt() message
		for(int i = 0; i<100000  && !wasInterrupted && !this.isInterrupted(); i++) {
			System.out.println(getName()+ ": " + i);
			
			try {
				sleep(1000);
//              Alternatives:
//				TimeUnit.SECONDS.sleep(1);
//				TimeUnit.MILLISECONDS.sleep(1000);
//				TimeUnit.MICROSECONDS.sleep(1000000);
				
			} catch (InterruptedException e) {
				System.err.println(getName() + ": I have been interrupted");
				System.err.println(getName() + ": My interrupt status is " + this.isInterrupted());
				
				// we have to store the knowledge that there was an interrupt during sleep
				// otherwise the interrupt during the sleep will be lost
				wasInterrupted = true;
				e.printStackTrace();
			}
		}
		System.out.println(getName()+ ": I'm ending now ... ");
	}
}
