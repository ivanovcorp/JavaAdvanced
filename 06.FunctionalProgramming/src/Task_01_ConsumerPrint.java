import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * Created by ivano on 2/2/2017.
 */
public class Task_01_ConsumerPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        Consumer<String> consumer =  printSir -> System.out.println(printSir);

        Arrays.stream(input).forEach(name -> consumer.accept(name));
    }
}
