package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;

public class p06_FindAndSumIntegers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> tokens = Arrays.asList(sc.nextLine().split("\\s+"));
		
		OptionalInt result = tokens.stream()
				.filter(s -> isNumber(s))					
				.mapToInt(Integer::parseInt)
				.reduce((x, y) -> x + y);
		
		if (result.isPresent()) {
			System.out.println(result.getAsInt());
		} else {
			System.out.println("No match");
		}
	}
	
	private static boolean isNumber(String str) {
		if (str.isEmpty())
			return false;
		try {
			int a = Integer.parseInt(str);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
		
	}

}
