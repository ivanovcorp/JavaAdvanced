package Lab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class p03_FirstName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> names = Arrays.asList(sc.nextLine().split("\\s+"));
		
		HashSet<Character> chars = new HashSet<>();
		
		Arrays.stream(sc.nextLine().split("\\s+"))
				.map(s -> s.charAt(0))
				.forEach(chars::add);
		
		Optional<String> firstName =  names.stream().filter(x -> chars.contains(Character.toLowerCase(x.charAt(0)))).sorted().findFirst();
		
		if (firstName.isPresent()) {
			System.out.println(firstName.get());
		} else {
			System.out.println("No match");
		}
	}

}
