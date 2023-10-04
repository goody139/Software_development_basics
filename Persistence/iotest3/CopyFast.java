package iotest3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Demonstrating I/O and streams (copy a file)
 */
public class CopyFast {

	public static void main(String[] args) {
	    long time1, time2;
		
		try {
			FileInputStream src = new FileInputStream("src/iotest3/SRC");
			FileOutputStream dst = new FileOutputStream("src/iotest3/DST");

			byte[] token = new byte[1024];
			int length =0;
			
		    time1 = System.currentTimeMillis();			
			while ((length=src.read(token))!=-1) {
				// write length bytes from the byte array token starting at offset 0 to output stream:
				dst.write(token, 0, length);
			}
			src.close();
			dst.close();
	        time2 = System.currentTimeMillis();
	        System.out.println("Duration of fast copying [milliseconds]: " + (time2-time1));
		} catch (IOException e) {
			System.err.println("Error during copying");
			e.printStackTrace();
		} 
	}

}
