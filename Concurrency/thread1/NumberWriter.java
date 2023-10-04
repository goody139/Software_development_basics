package thread1;

/**
 * Own thread class as subclass from class Thread
 * Overriding method run()
 */
public class NumberWriter extends Thread {
	
	public NumberWriter(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i=0; i<100;i++) {
			// formatted output (number format: three digits: %3d, leading zero: %0, line break: %n)
			System.out.printf("%s: %03d%n", getName(), i);
		}
		System.out.println(getName() + " end");
	}
}
