package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p04_ResponsiveUI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int n = Integer.valueOf(sc.nextLine());
		
		Runnable task = () -> primesInRange(1000000);
		Thread thread = new Thread(task);
		thread.start();		
		
		while (true) {
			String command = sc.nextLine();
			if (command.equals("stop")) {
				thread.interrupt();
			}
		}
		
		
	}
	
	public static void primesInRange(int number) {
		List<Integer> primes = new ArrayList<>();
		for (int primesCandidate = 0; primesCandidate <= number; primesCandidate++) {
			if (isPrime(primesCandidate)) {
				primes.add(primesCandidate);
			}
			
			if (Thread.currentThread().isInterrupted()) {
				System.out.println("Interrupted...");
				break;
			}
		}
		
		System.out.println(primes.size());
	}
	
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
