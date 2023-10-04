package exceptionmulticatch2;

import java.io.File;
import java.io.IOException;

/**
 * File creation if possible, demonstrating exceptions
 */
public class MultiCatch {

	public static void main(String[] args) {
		final String FILENAME = "src/exception2/MyFile";

		// create a new file object (no file yet)
		File f = new File(FILENAME);

		// try to create the file in the file system with several catch blocks
		try {
			f.createNewFile();
		} catch (IOException e1) {
			System.err.println("File " + FILENAME + " could not be created");
		} catch (Exception e2) {
			System.err.println("Some Error occurred");
		}

		// try to create the file in the file system with Java 1.7 multi-catch
		try {
			f.createNewFile();
		} catch (IOException | IllegalArgumentException e1) {
			System.err.println("Some Error occurred");
		} 
		
		System.out.println("Program continues ...");
	}

}
