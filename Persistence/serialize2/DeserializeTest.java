package serialize2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * Demo for the deserialization of some objects.
 * The deserialization refers to the serialized objects from serialize1!
 */
public class DeserializeTest {

	public static void main(String[] args) {
		InputStream fis = null;

		try {	
			// prepare a file and the appropriate streams:
			fis = new FileInputStream("src/serialize1/myobjects.ser");
			ObjectInputStream o = new ObjectInputStream(fis);
			
			// deserialize with typecast:
			// the typecast is necessary as readObject has Object as return type!
			String string = (String) o.readObject();
			Integer i = (Integer) o.readObject();

			System.out.println("Finished deserializing with the following results:");
			System.out.println(string);
			System.out.println(i);
		}

		catch (IOException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
			}
		}
	}

}