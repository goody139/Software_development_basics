package genericsnotgeneric1;

/**
 * Text class for a generic Box which is not using Generics
 */
public class MyBoxTest {

	public static void main(String[] args) {
		Box aBox = new Box();
		aBox.add(new Box("Cute Box"), new Student("Fritz Fischer"), new Object());

		// compiler error because getObject1 returns an Object and not a Box
		// Box b1 = aBox.getObject1();
		// System.out.println("Box b1 = aBox.getObject1(); has result: " + b1.toString());
		
		// correct and with proper typing (we have to know that we get sth of type Box):
		Box boxInBox = (Box)(aBox.getObject1());
		System.out.println("Box boxInBox = aBox.getObject1(); has result: " + boxInBox.toString());
		
		// runtime exception:
		// it's ok for the compiler as the typing seems to be ok with the cast
		// during runtime the system notices that studentInBox contains an instance of Student and not of Box
		Box studentInBox = (Box)(aBox.getObject2());
		System.out.println("Box studentInBox = aBox.getObject2(); has result: " + studentInBox.toString());
	
	}

}
