package serialize3;

import java.io.Serializable;

/**
 * A user defined class that is serializable.
 * The class has different types of attributes and a class variable.
 */
@SuppressWarnings("serial")
public class MySerializableClass implements Serializable {
	private String stringvalue;
	private int intvalue;
	public static String classvar = "class var";
	
	
	public MySerializableClass(String s, int i) {
		stringvalue = s;
		intvalue = i;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("I'm a MySerializableClass Object\n");
		sb.append("with the following values:\n");
		sb.append("    a string attribute:      ").append(stringvalue).append("\n");
		sb.append("    an int attribute:        ").append(intvalue).append("\n");
		sb.append("    a class variable:        ").append(classvar).append("\n");
		
		return sb.toString();
	}
}
