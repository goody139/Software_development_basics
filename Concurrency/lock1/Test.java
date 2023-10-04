package lock1;

/**
 * Demonstrates the usage of different locks
 */
public class Test {

	public static void main(String[] args) {
		Object[] o = {0,1,2,3,4,5,6,7,8,9};
		MyArray ma = new MyArray(o);
		
		// unsafe without unlock in the finally
		MyThread1 t1 = new MyThread1(ma,0,11);
		MyThread1 t2 = new MyThread1(ma,0,5);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		// safe, definitely unlocking
//		MyThread2 t3 = new MyThread2(ma,0,11);
//		MyThread2 t4 = new MyThread2(ma,0,5);
//		
//		t3.start();
//		t4.start();
	}

}
