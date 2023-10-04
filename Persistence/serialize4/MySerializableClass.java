package serialize4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;


/**
 * A user defined class that is serializable.
 * The class has attribute which is not serializable.
 */
@SuppressWarnings("serial")
public class MySerializableClass implements Serializable {
	private String stringvalue;
	private int intvalue;
	private static String classvar = "class variable";
	private BufferedReader br;  // not serializable
	
	
	public MySerializableClass(String s, int i) {
		stringvalue = s;
		intvalue = i;
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("I'm a MySerializableClass Object\n");
		sb.append("with the following values:\n");
		sb.append("    a string attribute:      ").append(stringvalue).append("\n");
		sb.append("    an int attribute:        ").append(intvalue).append("\n");
		sb.append("    a class variable:        ").append(classvar).append("\n");
		sb.append("    my BufferedReader:       ").append(br).append("\n");
		
		return sb.toString();
	}
}
