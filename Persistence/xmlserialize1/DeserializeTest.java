package xmlserialize1;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Deserialization of an object serialized in XML format.
 */
public class DeserializeTest {

	public static void main(String[] args) {
		InputStream fis = null;

		try {
			// prepare a file and the appropriate streams:
			fis = new FileInputStream("src/xmlserialize1/myobjects.ser.xml");
			XMLDecoder dec = new XMLDecoder(fis);
			
			// deserialize with typecast:
			MySerializableClass m1 = (MySerializableClass) dec.readObject();
			MySerializableClass m2 = (MySerializableClass) dec.readObject();
			MySerializableClass m3 = (MySerializableClass) dec.readObject();
	
			System.out.println("Finished XML deserialization. The deserialized objects are:");
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
		}

		catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
			}
		}
	}

}
