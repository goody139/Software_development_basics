package finally1;

import java.io.File;
import java.io.IOException;

/**
 * Creates a file demonstrating the work with try/catch and finally.
 */
public class CreateFile {

	public static void main(String[] args) {
		final String FILENAME = "src"+File.separator+"finally1"+File.separator+"MyFile";

		// create a new file object (no file yet)
		File f = new File(FILENAME);

		// try to create the file in the file system
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.err.println("File " + FILENAME + " could not be created");
		} finally {
			System.out.println("Finally block is always processed");
		}

		System.out.println("Program continues ...");
	}

}
