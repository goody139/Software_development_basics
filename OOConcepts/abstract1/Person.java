package abstract1;

/**
 * Abstract Class Person
 */
public abstract class Person {  // keyword: abstract has the consequence that instances of Person are impossible
	public String name;
	// public abstract int i; // variables cannot be abstract (would not make any sense)

    // constructor is possible (although instances of Person are impossible to create)
	// useful in a class hierarchy, for instance, to realize the principle of responsibility:
	//   Class Person is responsible for the attribute name. Therefore, it should care about its initialization.
 
	// public abstract Person();
	public Person(String name) {
		System.out.println("Hello from constructor of Person");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		// do some checking of parameter name first ...
		this.name = name;
	}
	
    // abstract method: return the profession of the person
	//  enforces the implementation of getProfession() in the Person's subclasses
	//  thus enforces a common contract fulfilled by all subclasses of Person
	public abstract String getProfession();
}
