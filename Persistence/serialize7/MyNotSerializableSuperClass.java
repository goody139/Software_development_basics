package serialize7;

/**
 * Super class that is not serializable.
 */
public class MyNotSerializableSuperClass {
	private String value;
	
	// the default constructor will be used during deserialization of the subclass objects
	public MyNotSerializableSuperClass() {
		value = "MyNotSerializableSuperClass Default Constructor Value";
	}
	
	public MyNotSerializableSuperClass(String v) {
		this.value = "Custom Constructor value:" + v;
	}
	
	public String toString() {
		return "value = " + value;
	}
}
