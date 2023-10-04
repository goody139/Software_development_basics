package serialize6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.ObjectStreamField;


/**
 * A user defined class that is serializable.
 * Via serialPersistentFields it defines explicitly which attributes are serializable.
 */
@SuppressWarnings("serial")
public class MySerializableClass implements Serializable {
	private String stringvalue;
	private int intvalue;
	private double doublevalue;
	private static String classvar = "class variable";
	private BufferedReader br;  

	// field to declare which attributes are serializable:
	private static final ObjectStreamField[] serialPersistentFields = {
	  new ObjectStreamField("stringvalue", String.class),
	  new ObjectStreamField("doublevalue", Double.TYPE)
      // new ObjectStreamField("classvar", String.class)
};
	
	public MySerializableClass(String s, int i, double d) {
		stringvalue = s;
		intvalue = i;
		doublevalue = d;
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("I'm a MySerializableClass Object\n");
		sb.append("with the following values:\n");
		sb.append("    a string attribute:      ").append(stringvalue).append("\n");
		sb.append("    an int attribute:        ").append(intvalue).append("\n");
		sb.append("    a double attribute:      ").append(doublevalue).append("\n");
		sb.append("    a class variable:        ").append(classvar).append("\n");
		sb.append("    my BufferedReader:       ").append(br).append("\n");
		
		return sb.toString();
	}
}
