import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_11_MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern patt = Pattern.compile("^(\\+359 [0-9] [0-9][0-9][0-9] [0-9][0-9][0-9][0-9]|\\+359-[0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9])$");
        String input = sc.nextLine().trim();

        while (!input.equals("end")) {
            Matcher matcher = patt.matcher(input);

            if (matcher.find()) {
                System.out.println(matcher.group(1));
            }

            input = sc.nextLine().trim();
        }
    }
}
