package filetest1;

import java.io.File;

/**
 * Demonstrating file and directory queries
 * Test with program parameters: src/filetest1/test1
 *                               test1
 *                               src/filetest1/test2
 */
public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = null;

		for (String s : args) {
			f = new File(s);
			System.out.println("\nFile " + s + " exists: " + f.exists());
			System.out.println("File " + s + " is a directory: " + f.isDirectory());
			System.out.println("File " + s + " is a file: " + f.isFile());
		}
	}

}
