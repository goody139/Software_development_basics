package threadexception7;

/**
 * Thread produces a number output 
 * Exception when number 50 is reached
 */
public class NumberWriter extends Thread {
	
	public NumberWriter(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println(getName()+ ": " + i);
			if (i == 50)
				i/=0; // exception!
		}
	}
}
