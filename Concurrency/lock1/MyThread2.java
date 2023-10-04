package lock1;

/**
 * thread exchanges elements in an array
 * uses the safe swap-method which definitely unlocks after the access
 */
public class MyThread2 extends Thread {
	
	private MyArray ma;
	private int i1;
	private int i2;
	
	public MyThread2(MyArray ma, int index1, int index2) {
		i1 = index1;
		i2 = index2;
		this.ma = ma; 
	}
	
	public void run() {
		ma.swap2(i1, i2);
	}
}
