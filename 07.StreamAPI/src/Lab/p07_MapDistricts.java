package Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class p07_MapDistricts {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, List<Integer>> cities = new HashMap<>();
		
		String[] tokens = sc.nextLine().split("\\s+");
		int limit = Integer.parseInt(sc.nextLine());
		
		for (String token : tokens) {
			String[] cityArgs = token.split(":");
			String cityName = cityArgs[0];
			int distinctPop = Integer.parseInt(cityArgs[1]);
			cities.putIfAbsent(cityName, new ArrayList<>());
			cities.get(cityName).add(distinctPop);
		}
		
		cities.entrySet().stream()
				.filter(c -> c.getValue().stream().mapToInt(Integer::valueOf).sum() > limit)
				.sorted((e1, e2) -> Integer.compare(
						e1.getValue().stream().mapToInt(Integer::valueOf).sum(),
						e2.getValue().stream().mapToInt(Integer::valueOf).sum()
						))
				.forEach(e -> {
					System.out.printf("%s: ", e.getKey());
					e.getValue().stream().sorted((n1, n2) -> Integer.compare(n2, n1))
					.limit(5)
					.forEach(n -> System.out.print(n + " "));
				System.out.println();
				});;
	}
}
