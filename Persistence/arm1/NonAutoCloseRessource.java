package arm1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Closing a resource without ARM using a finally block
 */

public class NonAutoCloseRessource {

	public static void main(String[] args) {
		
		File f = new File("src/arm1/tmp.txt");
		try {
			f.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		FileWriter dst = null; // visibility problem (implied due to the access in the finally block)
		try {
			// final FileWriter dst;   
			dst = new FileWriter(f);
			// dst.write("Test");
		} catch (IOException e) {
			System.err.println("Error during closing");
			e.printStackTrace();
		} finally {
			try { // nested exception handling with potential exception hiding
			  dst.close();
			}
			catch(IOException e) {
				System.err.println("Closing Error");
		    }
		}
	}
		
}





