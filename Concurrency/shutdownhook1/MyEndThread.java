package shutdownhook1;

/**
 * ShutdownHook Thread gives a message to System.out
 */
public class MyEndThread extends Thread {
	public void run() {
		System.out.println("[ShutdownHook Thread] Goodbye ... ");
	}
}
