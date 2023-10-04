package arm1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Closing a resource automatically with ARM
 */

public class AutoCloseRessource {

	public static void main(String[] args) {
	
		File f = new File("src/arm1/tmp.txt");
		try {
			f.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		// try with an argument: a resource of type AutoClosable
		try (FileWriter dst = new FileWriter(f)) {
			// dst.write("Test");
		} catch (IOException e) { // a catch block is necessary because of the implicit call of close()
			System.err.println("Error during closing");
			e.printStackTrace();
		}
	}
		
}





