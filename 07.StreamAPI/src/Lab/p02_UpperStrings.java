package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p02_UpperStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Arrays.asList(sc.nextLine().split("\\s+"))
				.stream()
				.map(s -> s.toUpperCase())
				.forEach(s -> System.out.print(s + " "));
		
		
	}

}
