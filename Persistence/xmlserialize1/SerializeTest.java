package xmlserialize1;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Serializing to XML format.
 */
public class SerializeTest {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        XMLEncoder enc;
        try {
        	// prepare a file and the appropriate streams:
            fos = new FileOutputStream("src/xmlserialize1/myobjects.ser.xml");
            enc = new XMLEncoder(fos);

        	// create instances from the user defined class:
            MySerializableClass m1 = new MySerializableClass("First Object",1,1.0);
            MySerializableClass m2 = new MySerializableClass("Second Object",2,2.0);
            MySerializableClass m3 = new MySerializableClass("Third Object",3,3.0);

            // serialize with the XMLEncoder:
            enc.writeObject(m1);
            enc.writeObject(m2);
            enc.writeObject(m3);
			
			System.out.println("Finished XML serialization. The serialized objects are:");
            System.out.println(m1);
            System.out.println(m2);
            System.out.println(m3);

            // enc.flush();
            enc.close();
            
        } catch (FileNotFoundException e) {
            System.err.println("Could not find File:" + fos);
        }
    }

}
