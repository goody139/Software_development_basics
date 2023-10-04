package deadlock1;

/**
 * Threads wants to write and thus, needs a pencil and paper. Only one thread
 * can use the same pencil and paper (no shared access) We, therefore, have to
 * synchronize.
 */
public class Thread2 extends Thread {

	private WritingMaterial writMat;

	public Thread2(String name, WritingMaterial wm) {
		setName(name);
		this.writMat = wm; // the shared resource is given as argument
	}

	public void run() {
		long i = 0L;
		while (true) {
			i = i + 1;
			System.out.println("Runde: " + i + " für [" + getName() + "]");
			synchronized (writMat.getCrayon()) {
				System.out.println(getName()
						+ " has the pencil and is waiting for the paper");

				synchronized (writMat.getPaper()) {
					System.out.println("[" + getName() + "] I'm writing");
				}
			}
		}
	}
}
