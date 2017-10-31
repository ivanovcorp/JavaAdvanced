import java.util.Scanner;

/**
 * Created by ivano on 2/1/2017.
 */
public class Task_02_ReplaceTag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String result = "";

        while (!input.equals("end")) {
            input = input.replaceAll("<a", "[URL");
            input = input.replaceAll("<\\/a>", "[/URL]");
            result += input;

            input = sc.nextLine();
        }
        System.out.println(result);
    }
}
