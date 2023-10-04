package iotest3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Demonstrating I/O and streams (copy a file)
 */
public class CopySlow {

	public static void main(String[] args) {
	    long time1, time2; // for measurements
		
		try {
			FileInputStream src = new FileInputStream("src/iotest3/SRC");
			FileOutputStream dst = new FileOutputStream("src/iotest3/DST");

			int token = 0;
	        time1 = System.currentTimeMillis();
			while ((token = src.read()) != -1) {
				// write byte per byte to the output
				dst.write(token);
			}
			src.close();
			dst.close();
	        time2 = System.currentTimeMillis();
	        System.out.println("Duration of byte per byte copying [milliseconds]: " + (time2-time1));
		} catch (IOException e) {
			System.err.println("Error during copying");
			e.printStackTrace();
		}
	}

}
