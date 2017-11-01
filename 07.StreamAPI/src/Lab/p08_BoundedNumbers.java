package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p08_BoundedNumbers
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        List<Integer> bounds = Arrays.asList(sc.nextLine().split("\\s+")).stream().map(Integer::valueOf).sorted().collect(Collectors.toList());
        int lowerBound = bounds.get(0);
        int upperBound = bounds.get(1);

        List<Integer> nums = Arrays.asList(sc.nextLine().split("\\s+")).stream()
                        .map(Integer::valueOf)
                        .filter(x -> x >= lowerBound && x <= upperBound)
                        .collect(Collectors.toList());
        nums.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

}



