package interface4;

// conflicting interface default methods (Java 8)
public class Smart implements Interface1, Interface2 {

	// overriding
	public int sameMethod(int x) {
		return 0;
	}

//	// explicit call by special syntax
//	public int sameMethod(int x) {
//		return Interface1.super.sameMethod(x);
//	}

}
