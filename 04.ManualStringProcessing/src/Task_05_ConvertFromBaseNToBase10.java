import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ivano on 1/31/2017.
 */
public class Task_05_ConvertFromBaseNToBase10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int toBase = sc.nextInt();
        String num = sc.nextLine().trim();
        System.out.println(new BigInteger(num, toBase));
    }
}
