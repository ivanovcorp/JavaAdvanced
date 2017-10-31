import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by ivano on 1/31/2017.
 */
public class Task_08_MultiplyBigNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal num1 = sc.nextBigDecimal();
        BigDecimal num2 = sc.nextBigDecimal();
        System.out.println(num1.multiply(num2));

    }
}
