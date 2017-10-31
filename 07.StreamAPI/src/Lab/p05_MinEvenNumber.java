package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;

public class p05_MinEvenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> tokens = Arrays.asList(sc.nextLine().split("\\s+"));
		
		OptionalDouble result = tokens.stream().filter(x -> !x.isEmpty()).mapToDouble(Double::valueOf).sorted().filter(x -> x % 2 == 0).findFirst();
		
		if (result.isPresent()) {
			System.out.printf("%.2f", result.getAsDouble());
		} else {
			System.out.println("No match");
		}
		
	}

}
