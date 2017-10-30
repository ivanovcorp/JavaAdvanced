import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by iv.ivanov on 1/6/2017.
 */
public class Task_05_Phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();
        while (!input.contains("search")) {
            String[] splitted = input.split("-");
            if(splitted.length > 1) {
                phonebook.put(splitted[0], splitted[1]);
            } else {
                phonebook.put(splitted[0], null);
            }
            input = sc.nextLine();
        }

        input = null;
        input = sc.nextLine();
        ArrayList<String> searchFor = new ArrayList<>();
        while (!input.contains("stop")) {
            searchFor.add(input);
            input = sc.nextLine();
        }

        for (String name : searchFor) {
            if (phonebook.containsKey(name)) {
                System.out.println(name + " -> " + phonebook.get(name));
            }
            else {
                System.out.println("Contact " + name + " does not exist.");
            }
        }
    }
}
