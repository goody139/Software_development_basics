package filetest4;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Demonstrating the usage of temporary files
 */
public class FileTest {

	public static void main(String[] args) {

		File tmpDatei = null;
		
		try {
			tmpDatei = File.createTempFile("tmp",".txt",new File("src/filetest4"));
		} catch (IOException e) {
			System.err.println("File could not be created");
			e.printStackTrace();
		}

		System.out.print("Hit Return to continue");
		Reader r = new InputStreamReader(System.in);
		try {
			r.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(tmpDatei!=null)
			tmpDatei.deleteOnExit();
	}

}
