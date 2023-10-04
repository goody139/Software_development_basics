package serialize7;

import java.io.Serializable;

/**
 * Serializable class with a super class that is not serializable.
 * Note that a class can only be serialized if the not serializable super class as a default constructor. 
 */
@SuppressWarnings("serial")
public class MySerializableClass extends MyNotSerializableSuperClass implements Serializable {
	private String stringvalue;
	private int intvalue;
	private double doublevalue;
	private static String classvar = "class variable";

	public MySerializableClass(String s, int i, double d) {
		super("Value set by the custom constructor!");
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
		sb.append("    a class variable:        ").append(classvar).append("\n");
		sb.append("    elements of the super class:\n").append(super.toString()).append("\n");
	
		return sb.toString();
	}
}
