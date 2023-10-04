package thread1;

import java.util.Date;

/**
 * Alternative way to realize an own thread functionality:
 * Own Runnable class implementing the interface Runnable
 * Overriding method run()
 */
public class DateWriter implements Runnable {

	private String name;
	
	public DateWriter(String name) {
		this.name=name;
	}
	
	/**
	 * overriding the method run() defined in the interface Runnable
	 */
	public void run() {
		for(int i=0;i<100;i++) {
			// formatted date output:
			System.out.printf(name + ": %1$tT:%1$tL%n", new Date());
		}
		System.out.println(name + " end");
	}

}
