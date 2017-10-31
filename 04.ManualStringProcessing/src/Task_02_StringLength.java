import java.util.Scanner;

/**
 * Created by ivano on 1/31/2017.
 */
public class Task_02_StringLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.length() < 20) {
            for (int i = input.length(); i < 20; i++) {
                input += '*';
            }
            System.out.println(input);
        } else {
            System.out.println(input.substring(0, 20));
        }
    }
}
