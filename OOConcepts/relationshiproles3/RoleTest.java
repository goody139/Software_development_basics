package relationshiproles3;

/**
 * Demonstration of one way to map roles to the implementation
 **/
public class RoleTest {

	public static void main(String[] args) {
		
		// Interfaces may serve as an implementation of roles in the model
		BankRobber p = new Person("Fritz Fischer");
		GetAwayVehicle v = new Bike();
		System.out.println("The Robber's escape was successful: " + 
				            p.getaway(v));		
	}
}
