package serialize9;

import java.io.Serializable;

/**
 * Serializable class.
 */

public class MySerializableClass implements Serializable {
	private static final long serialVersionUID = 1L; // user defined version number
	private String stringvalue;
	private int intvalue;
	private double doublevalue;

	public MySerializableClass(String s, int i, double d) {
		stringvalue = s;
		intvalue = i;
		doublevalue = d;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("I'm a MySerializableClass Object\n");
		sb.append("with the following values:\n");
		sb.append("    a string attribute:      ").append(stringvalue).append("\n");
		sb.append("    an int attribute:        ").append(intvalue).append("\n");
		sb.append("    a double attribute:      ").append(doublevalue).append("\n");
	
		return sb.toString();
	}
	
	public int getInt() {
	   return intvalue;
    }

}
