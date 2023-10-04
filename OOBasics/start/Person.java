package start;

public class Person {

	// Attribut, Instanzvariable: Deklaration (sollten moeglichst private sein)
	String name; 
	int alter; 
	
	// Ersetzt hier den Default Constructor
	Person() {
	}
	
	// Custom Constructor
	Person(int a) {
		this();
		initialize(); 
	}
	
	// Initialisierung in einer separaten Methode lokalisiert
	// (kann bei der Umsetzung des Lokalitaetsprinzips helfen)
	public void initialize() {
		name = "NN";
	}
	
	// Methode, Member Function: Definition
	int jahrgang() { // Rückgabetyp ist primitiv: int; alternativ: void, Referenz
	   return (2017 - alter);
	}

	// Signatur (in Java: ohne Rückgabetyp)
	int jahrgang (int a) { // formaler Parameter: a
		return (2017 - a);
	}
}
