import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by iv.ivanov on 1/4/2017.
 */
public class Task_02_SetsOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstInputLine = sc.nextLine().split(" ");

        int n = Integer.parseInt(firstInputLine[0]);
        int m = Integer.parseInt(firstInputLine[1]);

        LinkedHashSet<Integer> nSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> mSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            nSet.add(Integer.parseInt(sc.nextLine()));
        }

        for (int i = 0; i < m; i++) {
            mSet.add(Integer.parseInt(sc.nextLine()));
        }

        LinkedHashSet<Integer> uniqueNumsInLongerSet = new LinkedHashSet<>();
        if (nSet.size() > mSet.size()) {
            for (int num : nSet) {
                if (mSet.contains(num)) {
                    uniqueNumsInLongerSet.add(num);
                }
            }
        } else {
            for (int num : mSet) {
                if (nSet.contains(num)) {
                    uniqueNumsInLongerSet.add(num);
                }
            }
        }

        for (int num : uniqueNumsInLongerSet) {
            System.out.print(num + " ");
        }
    }
}
