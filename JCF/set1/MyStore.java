package set1;

/**
 * Small class storing one integer value 
 * overriding the methods: equals() and hashCode()
 */
public class MyStore {
	int i = 10;
	
	/**
	 * Compares two objects if the data contained is equal.
	 * @return true if equal, else false
	 */
	public boolean equals(Object o) {
		return this.i == ((MyStore)o).i;
	}
	
	/**
	 * Provides a HashCode for the object.
	 * @return hash value
	 */
	public int hashCode() {
		return i;
	}
	
	public int getValue() {
		return i;
	}
	
	public void setValue(int value) {
		i = value;
	}
}
