package randomaccess1;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Demonstrates the usage of RandomAccessFile
 */

public class RandomAccessTest1 {


	public static void main(String[] args) {
		RandomAccessFile file;
		try {
			file = new RandomAccessFile("src/randomaccess1/test.txt", "rw" );
			System.out.println("Length: " + file.length());
			file.seek(10);
			file.writeChars("T");
			System.out.println("Length: " + file.length());
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
