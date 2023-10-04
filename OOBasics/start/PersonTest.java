package start;

public class PersonTest {

	public static void main(String[] args) {

	    Person lisa = new Person(); // Definition: Wertbelegung
		System.out.println(lisa.name); // Attribute sollten besser von extern nicht direkt zugreifbar sein ...
		System.out.println(lisa.jahrgang(8)); // konkreter Parameter: 8		
	}

}
