package producerconsumerbusywait;

/**
 * Many Producer, many Consumer: Busy Wait. Bad implementation with busy wait.
 */
public class ProdConDemo {

	public static void main(String args[]) {
		Depot depot = new Depot();
		Producer producer1 = new Producer("Producer1",depot);
		Producer producer2 = new Producer("Producer2",depot);
		Producer producer3 = new Producer("Producer3",depot);
		
		Consumer consumer1 = new Consumer("Consumer1",depot);
		Consumer consumer2 = new Consumer("Consumer2",depot);
		Consumer consumer3 = new Consumer("Consumer3",depot);
		Consumer consumer4 = new Consumer("Consumer4",depot);
		
		producer1.start();
		producer2.start();
		producer3.start();
		
		consumer1.start();
		consumer2.start();
		consumer3.start();
		consumer4.start();
	}

}
