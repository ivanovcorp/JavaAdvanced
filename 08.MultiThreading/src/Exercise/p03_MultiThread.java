package Exercise;

public class p03_MultiThread {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable task = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.printf("[%s] ", i);
				Thread.yield();
			}
		};
		
		Thread[] threads = new Thread[5];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(task);
			threads[i].start();
		}
		
		for (Thread t : threads) {
			t.join();
		}
		
		System.exit(1);
	}

}
