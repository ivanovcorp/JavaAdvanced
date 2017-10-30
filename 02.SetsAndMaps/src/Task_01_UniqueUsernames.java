import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by iv.ivanov on 1/4/2017.
 */
public class Task_01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        LinkedHashSet<String> names = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
