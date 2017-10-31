package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class p01_TakeTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] tokens = sc.nextLine().split("\\s++");
		Integer[] nums = new Integer[tokens.length];
		for (int i = 0; i < tokens.length; i++) {
			nums[i] = Integer.valueOf(tokens[i]);
		}
		
		Arrays.asList(nums).stream()
				.distinct()
				.filter(x -> x >= 10 && x <= 20)
				.limit(2)
				.forEach(x -> System.out.println(x));
	}

}
