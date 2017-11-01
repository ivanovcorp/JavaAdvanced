package Exercise;

public class p01_SmallExample {

	public static void main(String[] args) {
		
		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println(i);
			}
		};
		
		
		Thread thread = new Thread(task);
		
		thread.start();
		
		
		/*try {
			thread.join(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
