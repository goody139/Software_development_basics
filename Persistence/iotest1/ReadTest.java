package iotest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Demonstrating I/O and streams (reading from a source, here stdin)
 */
public class ReadTest {

	public static void main(String[] args) {
		
		Reader r = new InputStreamReader(System.in);
		
		BufferedReader in = new BufferedReader(r); // stream filter
		
		System.out.print("Insert an integer value: ");
		
		boolean ok;
		int result = 0;
		
		do {
			ok = true;
			try {
				String s = in.readLine();
				result = Integer.parseInt(s);
			} catch (IOException e) {
				System.err.println("Could not read from stdin!");
				e.printStackTrace();
			} catch (NumberFormatException e1) {
				System.err.print("Error, please insert an integer: ");
				ok = false;
			}
		} while(!ok);
		
		System.out.println("Read the number: "+ result);
		
	}

}
