package lock1;

/**
 * thread exchanges elements in an array
 * uses the unsafe swap-method which might lock forever
 */
public class MyThread1 extends Thread {
	
	private MyArray ma;
	private int i1;
	private int i2;
	
	public MyThread1(MyArray ma, int index1, int index2) {
		i1 = index1;
		i2 = index2;
		this.ma = ma;
	}
	
	public void run() {
		ma.swap1(i1, i2);
	}
}
