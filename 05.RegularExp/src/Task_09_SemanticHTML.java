import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_09_SemanticHTML {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern openTag = Pattern.compile("<div.*?\\b((?:id|class)\\s*=\\s*\"(.*?)\").*?>");
        Pattern closeTag = Pattern.compile("<\\/div>\\s.*?(\\w+)\\s*-->");
        Pattern removeEmpty = Pattern.compile("^\\s+");

        String input = sc.nextLine();
        Matcher matcher;
        int count = 0;
        while (!input.equals("END")) {

            String save = "";
            matcher = removeEmpty.matcher(input);
            if (matcher.find()){
                save = matcher.group();
            }

            matcher = openTag.matcher(input);
            while (matcher.find()) {
                input = input.replace("div", matcher.group(2).trim());
                input = input.replace(" " + matcher.group(1).trim(), "");
                input = input.replaceAll("\\s*>", ">");
            }

            matcher = closeTag.matcher(input);

            while (matcher.find()){
                input = input.replace(matcher.group(), "</" + matcher.group(1).trim() + ">");
                input = input.replaceAll("\\s*>", ">");
            }
            if (count > 0) {
                input = save + input.replaceAll("  +", " ");
            }
            System.out.println(input);
            count++;
            input = sc.nextLine();
        }
    }
}
