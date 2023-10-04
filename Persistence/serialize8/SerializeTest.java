package serialize8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Demo serialization.
 */
public class SerializeTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream o;
		try {
			
			// prepare a file and the appropriate streams:
			fos = new FileOutputStream("src/serialize8/myobjects.ser");
			o = new ObjectOutputStream(fos);
			
			// create instances from the user defined class:
			MySerializableClass m1 = new MySerializableClass("First Object",1,1.0);
			MySerializableClass m2 = new MySerializableClass("Second Object",2,2.0);
			MySerializableClass m3 = new MySerializableClass("Third Object",3,3.0);
			
			// serialize:
			o.writeObject(m1);
			o.writeObject(m2);
			o.writeObject(m3);
			
			System.out.println("Finished serialization. The serialized objects are:");
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
			
			o.flush();
			o.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Could not find File:"+fos);
		} catch (IOException e) {
			System.err.println("Could not write ObjectOutputStream:"); 
			e.printStackTrace();
		}
	}

}
