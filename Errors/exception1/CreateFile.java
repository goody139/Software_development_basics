package exception1;

import java.io.File;
import java.io.IOException;

/**
 * File creation if possible, demonstrating exceptions
 */
public class CreateFile {

	public static void main(String[] args) {

		// constant (in capital letters)
		final String FILENAME = "src/exception1/MyFile";
		// final String FILENAME = "DirectoryNotAvailable/exception1/MyFile";

		// create a new file object (no file yet)
		File f = new File(FILENAME);

		// try to create the file in the file system
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.err.println("File " + FILENAME + " could not be created");
		}

		System.out.println("Program continues ...");
	}

}
