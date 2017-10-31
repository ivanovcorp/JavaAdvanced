import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ivano on 2/1/2017.
 */
public class Task_01_SeriesOfLetters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern patt = Pattern.compile("(.)\\1*");

        String input = sc.nextLine();

        Matcher matcher = patt.matcher(input);

        String newStr = "";

        while (matcher.find()){
            newStr += matcher.group(1).charAt(0);
        }
        System.out.println(newStr);
    }
}
