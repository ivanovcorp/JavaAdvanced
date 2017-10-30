import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by iv.ivanov on 1/9/2017.
 */
public class Task_06_AMinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String currentKey = input;
        int currentNum = 0;
        HashMap<String, Integer> resources = new HashMap<>();

        while (!input.contains("stop")) {
            input = sc.nextLine();
            if (!input.contains("stop")) {
                currentNum = Integer.parseInt(input);
            }

            if (!resources.containsKey(currentKey)) {
                resources.put(currentKey, currentNum);
            } else {
                int currQuantity = resources.get(currentKey);
                currQuantity += currentNum;
                resources.remove(currentKey);
                resources.put(currentKey, currQuantity);
            }
            input = sc.nextLine();
            currentKey = input;
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
