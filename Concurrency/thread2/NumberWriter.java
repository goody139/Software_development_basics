package thread2;

/**
 * NumberWriter ends a loop in the run() method when it is interrupted
 */
public class NumberWriter extends Thread {
	
	public NumberWriter(String name) {
		setName(name);
	}
	
	public void run() {
		int i = 0;
		while(!isInterrupted()) {
			System.out.printf("%s: %03d%n", getName(), i++);		
		}
		    
		System.out.flush();
		System.err.printf("%s ends now ...%n",getName());
		System.err.flush();
	}
}
