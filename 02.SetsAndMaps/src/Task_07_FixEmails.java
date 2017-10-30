import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ivano on 1/30/2017.
 */
public class Task_07_FixEmails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String test = "ivanivan@abv.bg";
        //System.out.println(test.substring(test.length() - 1 - 1));

        String input = sc.nextLine();
        String currentKey = input;
        String currentValue = "";
        HashMap<String, String> resources = new HashMap<>();

        while (!input.contains("stop")) {
            input = sc.nextLine();
            if (!input.contains("stop")) {
                currentValue = input;
            }

            if (!resources.containsKey(currentKey)) {
                String currCountryCode = currentValue.substring(currentValue.length() - 1 - 1).toLowerCase();
                if (!currCountryCode.equals("us") && !currCountryCode.equals("uk") && !currCountryCode.equals("om")) {
                    //System.out.println(currentValue.substring(currentValue.length() - 1 -1));
                    resources.put(currentKey, currentValue);
                }
                /*if (currCountryCode.equals("bg")) {
                    //System.out.println(currentValue.substring(currentValue.length() - 1 -1));
                    resources.put(currentKey, currentValue);
                }*/

            }
            input = sc.nextLine();
            currentKey = input;
        }

        for (Map.Entry<String, String> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
