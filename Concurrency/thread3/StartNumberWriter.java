package thread3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * creates and starts two threads and terminate them after the input of return
 */
public class StartNumberWriter {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Thread t1= new NumberWriter("Thread1");
		Thread t2 = new NumberWriter("Thread2");
		
		System.out.println("Thread1 starts");
		t1.start();
		
		System.out.println("Thread2 starts");
		t2.start();
		
		System.out.println("Hit Return to stop Thread 1");
		try {
			br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		t1.interrupt();
		
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
