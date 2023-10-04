package xmlserialize1;

/**
 * Class with JavaBeans properties, 
 * i.e. it has a default constructor and getter and setter methods.
 * The JavaBeans properties are the prerequisite when using an XMLEncoder/XMLDecoder.
 * Missing getter or setter methods will result in data loss during serialization/deserialization.
 */

public class MySerializableClass {
	private String stringValue;
	private int intValue;
	private double doubleValue;

	public MySerializableClass() {
	}
	
	public MySerializableClass(String s, int i, double d) {
		stringValue = s;
		intValue = i;
		doubleValue = d;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("I'm a MySerializableClass Object\n");
		sb.append("with the following values:\n");
		sb.append("    a string attribute:      ").append(stringValue).append("\n");
		sb.append("    an int attribute:        ").append(intValue).append("\n");
		sb.append("    a double attribute:      ").append(doubleValue).append("\n");

		return sb.toString();
	}

	public double getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(double dv) {
		this.doubleValue = dv;
	}

	public int getInt() {
		return intValue;
	}

	public void setInt(int iv) {
		this.intValue = iv;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String sv) {
		this.stringValue = sv;
	}
}
