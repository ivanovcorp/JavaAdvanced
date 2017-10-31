import java.util.Scanner;

/**
 * Created by ivano on 1/31/2017.
 */
public class Task_03_FormattingNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        String hexValue = Integer.toHexString(a).toUpperCase();
        String binaryValue = Integer.toBinaryString(a);
        String paddedBinary = "";
        if (binaryValue.length() > 10) {
            paddedBinary = binaryValue.substring(0, 10);
        } else {
            paddedBinary = "0000000000".substring(binaryValue.length()) + binaryValue;
        }

        System.out.format("|%-10s|%s|%10s|%-10s|", hexValue, paddedBinary, String.format("%.2f", b), String.format("%.3f", c));
    }
}
