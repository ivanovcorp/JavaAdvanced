import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_10_MatchFullName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern patt = Pattern.compile("^([A-Z][a-z]+ [A-Z][a-z]+)$");
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
