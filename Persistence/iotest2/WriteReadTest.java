package iotest2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * Demonstrating I/O and streams (writing to a drain)
 */
public class WriteReadTest {

	public static void main(String[] args) {
		
		// new file object
		File file = new File("src/iotest2/FILE.txt");
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file, true); // true => appends in case the file already exists
			fw.write("This is a test " + new Date() + "\n");
		} catch (IOException e) {
			System.err.println("Could not write");
			e.printStackTrace();
		} 
		finally {
			try { fw.flush(); } catch (IOException e) { System.err.println("Could not flush"); }
			try { fw.close(); } catch (IOException e) { System.err.println("Could not close"); }

		}
	}
}
