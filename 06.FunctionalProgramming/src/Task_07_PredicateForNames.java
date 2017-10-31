import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Created by ivano on 2/3/2017.
 */
public class Task_07_PredicateForNames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lenght = Integer.parseInt(sc.nextLine());
        String[] names = sc.nextLine().split("\\s+");

        Predicate<String> isEqualToGivenNum = name -> name.length() <= lenght;

        for (String name : names) {
            if (isEqualToGivenNum.test(name)) {
                System.out.println(name);
            }
        }
    }
}
