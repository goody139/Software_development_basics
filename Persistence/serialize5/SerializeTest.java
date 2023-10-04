package serialize5;

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
			fos = new FileOutputStream("src/serialize5/myobjects.ser");
			o = new ObjectOutputStream(fos);
			
			// create instances from the user defined class and serialize them:		
			o.writeObject(new MySerializableClass("First Object",1));
			o.writeObject(new MySerializableClass("Second Object",2));
			o.writeObject(new MySerializableClass("Third Object",3));
			
			System.out.println("Finished serialization.");
			
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
