import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ivano on 1/31/2017.
 */
public class Task_04_ConvertFromtBase10ToBaseN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int toBase = sc.nextInt();
        String num = sc.nextLine().trim();
        BigInteger number = new BigInteger(num);
        System.out.println(number.toString(toBase));
    }
}
