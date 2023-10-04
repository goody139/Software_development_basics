package threadpriority5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Creates two threads with different priority and starts them
 */
public class StartNumberWriter {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// create threads
		Thread t1 = new NumberWriter("Thread1");
		Thread t2 = new NumberWriter("Thread2");
		
		// set priority
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		// start threads
		System.out.println("Thread1 starts");
		t1.start();
		
		System.out.println("Thread2 starts");
		t2.start();
		
		System.out.println("Hit Return to change priority");
		try {
			br.readLine();
			System.out.println("Priority switched");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// change priorities
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Program end");
	}
}
