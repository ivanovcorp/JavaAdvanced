import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * Created by ivano on 2/2/2017.
 */
public class Task_02_KnightsOfHonor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");

        Consumer<String> printSir = makeSir -> System.out.printf("Sir %s%n", makeSir);

        Arrays.stream(input).forEach(name -> printSir.accept(name));

    }
}
