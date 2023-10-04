package relationshiproles3;


// in this application case it might be even better to assign a role
// by means of inheritance than with interfaces
// (BankRobber as a specialization of Person would fit nicely)
public class Person implements BankRobber {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean getaway(GetAwayVehicle v) {
		// we assume a successful escape
		// our association is a using relationship as the robber
		// just uses the get-away vehicle
		return true;
	}
	
	public void robBank() {
		// many things to do ...
	}
}
