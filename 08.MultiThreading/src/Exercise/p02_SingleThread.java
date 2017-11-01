package Exercise;

public class p02_SingleThread {

	public static void main(String[] args) {
		
		Runnable task = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
			}
		};
		
		Thread thread = new Thread(task);
		
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.exit(1); // ends program
	}

}
