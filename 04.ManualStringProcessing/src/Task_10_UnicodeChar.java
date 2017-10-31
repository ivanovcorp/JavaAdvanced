import java.util.Scanner;

/**
 * Created by ivano on 1/31/2017.
 */
public class Task_10_UnicodeChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.printf( "\\u" + Integer.toHexString(word.charAt(i) | 0x10000).substring(1));
        }
    }
}
