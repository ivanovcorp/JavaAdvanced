import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by ivano on 2/2/2017.
 */
public class Task_05_AppliedArithmetics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] input = line.split("\\s+");

        Integer[] nums = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        Function<Integer, Integer> add = num -> num + 1;
        Function<Integer, Integer> multiply = num -> num * 2;
        Function<Integer, Integer> subtract = num -> num - 1;
        Consumer<Integer> print = num -> System.out.print(num + " ");

        while (!(line = sc.nextLine()).equals("end")) {
            for (int i = 0; i < nums.length; i++) {
                int curr = nums[i];
                switch (line) {
                    case "add":
                        nums[i] = add.apply(curr);
                        break;
                    case "multiply":
                        nums[i] = multiply.apply(curr);
                        break;
                    case "subtract":
                        nums[i] = subtract.apply(curr);
                        break;
                    case "print":
                        print.accept(nums[i]);
                        break;
                }
            }
        }

        System.out.println();
    }
}
