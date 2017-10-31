package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class p04_AverageOfDouble {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> tokens = Arrays.asList(sc.nextLine().split("\\s+"));
		
		DoubleStream ds = tokens.stream()
				.filter(x -> !x.isEmpty())
				.mapToDouble(x -> Double.valueOf(x));
		OptionalDouble avgDoubles = ds.average();
		
		if (avgDoubles.isPresent()) {
			System.out.printf("%.2f", avgDoubles.getAsDouble());
		} else {
			System.out.println("No match");
		}
	}

}
