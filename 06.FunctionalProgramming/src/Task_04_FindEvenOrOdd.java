import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Created by ivano on 2/2/2017.
 */
public class Task_04_FindEvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstLine = sc.nextLine().split("\\s+");
        int start = Integer.parseInt(firstLine[0]);
        int end = Integer.parseInt(firstLine[1]);

        String oddOrEvenCommand = sc.nextLine();

        Predicate<Integer> isEven = num -> num % 2 == 0;

        for (int i = start; i <= end; i++) {
            if (oddOrEvenCommand.equals("even")) {
                boolean even = isEven.test(i);
                if (even) {
                    System.out.print(i + " ");
                }
            } else {
                boolean even = isEven.test(i);
                if (!even) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
}
