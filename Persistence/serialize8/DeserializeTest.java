package serialize8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * Demo of a deserialization with versioning:
 * step 1: run SerializeTest (serializing objects of type MySerializableClass)
 * step 2: change code class MySerializableClass by transforming the getInt() method to a comment
 * step 3: run DeserializeTest
 */
public class DeserializeTest {

	public static void main(String[] args) {
		InputStream fis = null;

		try {
			// prepare a file and the appropriate streams:
			fis = new FileInputStream("src/serialize8/myobjects.ser");
			ObjectInputStream o = new ObjectInputStream(fis);
			
			// deserialize with typecast:
			MySerializableClass m1 = (MySerializableClass) o.readObject();
			MySerializableClass m2 = (MySerializableClass) o.readObject();
			MySerializableClass m3 = (MySerializableClass) o.readObject();
			
			System.out.println("Finished deserialization. The deserialized objects are:");
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
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
