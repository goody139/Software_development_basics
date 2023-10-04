package threadconcurrentclassvar8;

/**
 * Demonstrating a concurrent access to a class variable (accessed by all NumberWriter Objects) 
 */
public class NumberWriter extends Thread{
	
	// class variable counter
	static int counter = 0;
	
	// further thread attributes
	private int localPrivateCounter = 0;
	public int localPublicCounter = 0;
	
	public NumberWriter(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.printf("%s class variable: %03d%n",getName(), counter++);
			// System.out.printf("%s private attribute: %03d%n",getName(), localPrivateCounter++);
			// System.out.printf("%s public attribute: %03d%n",getName(), localPublicCounter++);
		}
	}
}
