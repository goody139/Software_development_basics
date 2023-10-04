package deadlock1;

/**
 * Class creates and starts two threads which want to write.
 * The two threads have to concurrently share the writing materials.
 */
public class Test {
	public static void main(String[] args) {
		WritingMaterial writMat = new WritingMaterial();
		
		Thread1 t1 = new Thread1("Thread1", writMat);
		Thread2 t2 = new Thread2("Thread2", writMat);
		
		t1.start();
		t2.start();
	}
}
