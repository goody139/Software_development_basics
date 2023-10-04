package classproperties1;

public class PersTest {
	public static void main(String[] args) {
		System.out.println(Person1.j);
		// counting instance with a class variable
		Person p1 = new Person();
		System.out.println("No: " + Person.objNo + " Ohren: " + Person.NUMBEROFEARS);
		Person p2 = new Person();
		System.out.println("No: " + Person.objNo + " Ohren: " + Person.NUMBEROFEARS);
		p2.dying();
		System.out.println("No: " + Person.objNo);
		
		// Java library, usage of a class method of class Math
//		double x = 4.0d;
//		System.out.println("Square Root with Class Math: " 
//				              + Math.sqrt(x));

		// Java library, usage of a class variable of class Math
//		System.out.println("PI class variable of with Class Math: " 
//	              + Math.PI);
		
		// Person class and instance methods and their access capabilities
        // (see what instanceMethod() does)
//	    p1.instanceMethod();
		
		// Usage of a class with static constructor:
//		System.out.println("Class attribute i - the same for all instances: " + Person1.i);
//		Person1 p3 = new Person1();
//		// access to class properties should not be based on instance elements (here: p3.i is no good)
//		System.out.println("Class attribute i has the same value within an instance of the class : " + p3.i);
	
	}
}
