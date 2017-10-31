import java.util.Scanner;
import java.util.function.Function;

/**
 * Created by ivano on 2/2/2017.
 */
public class Task_03_CustomMinFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");

        Integer[] nums = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        Function<Integer[], Integer> findSmalles = numbers -> numbers[0] > numbers[1] ? numbers[1] : numbers[0];

        int smalles = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i+=2) {
            Integer[] toPassToFunction = new Integer[2];
            toPassToFunction[0] = nums[i];
            toPassToFunction[1] = nums[i + 1];
            int current = findSmalles.apply(toPassToFunction);
            if (current < smalles) {
                smalles = current;
            }
        }

        System.out.println(smalles);
    }
}
