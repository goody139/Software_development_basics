package thread2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Start two threads and terminate them after the input of return
 */
public class StartNumberWriter {

	public static void main(String[] args) {
		
		// Reader to get the input from the keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// create two threads
		Thread t1 = new NumberWriter("Thread1");
		Thread t2 = new NumberWriter("Thread2");
		
		// start threads
		System.out.println("Thread1 starts");
		t1.start();
		
		System.out.println("Thread2 starts");
		t2.start();
		
		// wait for a return, then stop Thread1
		System.out.println("Hit Return to stop Thread1");
		try {
			br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		t1.interrupt();
		
		// wait for a return, then stop Thread2
		System.out.println("Hit Return to stop Thread 2");
		try {
			br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		t2.interrupt();
				
		System.out.println("Program end");
	}
}
