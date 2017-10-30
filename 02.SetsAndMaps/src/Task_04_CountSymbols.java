import java.util.*;
import java.lang.String;

/**
 * Created by iv.ivanov on 1/6/2017.
 */
public class Task_04_CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] symbols = input.toCharArray();
        java.util.Arrays.sort(symbols);

        LinkedHashMap<Character, Integer> resultMap = new LinkedHashMap<>();
        for (char symbol : symbols) {
            int count = 0;
            for (char symbol2 : symbols) {
                if (symbol == symbol2) {
                    count++;
                }
            }
            resultMap.put(symbol, count);
            count = 0;
        }

        for (Map.Entry<Character, Integer> entry : resultMap.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value + " time/s");
        }
    }
}
