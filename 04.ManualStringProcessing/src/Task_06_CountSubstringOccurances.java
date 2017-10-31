import java.util.Scanner;

/**
 * Created by ivano on 1/31/2017.
 */
public class Task_06_CountSubstringOccurances {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String word = sc.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length() - word.length() + 1; i++) {
            if (input.substring(i, i + word.length()).equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
