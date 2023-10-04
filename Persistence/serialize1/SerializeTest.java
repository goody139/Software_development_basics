package serialize1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Demo for the serialization of some objects.
 * Serialized objects are stored.
 */
public class SerializeTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream o;
		try {
			// prepare a file and the appropriate streams:
			fos = new FileOutputStream("src/serialize1/myobjects.ser");
			o = new ObjectOutputStream(fos);

			// serialize
			o.writeObject("Testzeichenkette");
			o.writeObject(new Integer(10));
			// o.writeObject(new Test());

			System.out.println("Finished serializing.");
			
			o.flush();
			o.close();
		} catch (FileNotFoundException e) {
			System.err.println("Could not find File:"+fos);
		} catch (IOException e) {
			System.err.println("Could not write ObjectOutputStream:"); e.printStackTrace();
		}
	}

}
