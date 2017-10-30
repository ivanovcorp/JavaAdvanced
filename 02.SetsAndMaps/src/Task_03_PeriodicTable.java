import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by iv.ivanov on 1/4/2017.
 */
public class Task_03_PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<String> elems = new TreeSet<>();

        for (int i = 0; i <= n; i++) {
            String line = sc.nextLine();
            String[] lineElems = line.split(" ");
            for (int j = 0; j < lineElems.length; j++) {
                elems.add(lineElems[j]);
            }
        }

        for (String elem : elems) {
            System.out.print(elem + " ");
        }
    }
}
