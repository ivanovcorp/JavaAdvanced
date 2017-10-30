import java.util.Scanner;
import java.util.Stack;

public class Task_02_BasicStackOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstLine = sc.nextLine().split(" ");
        String[] secondLine = sc.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        int smallest = Integer.MAX_VALUE;
        Stack<Integer> nums = new Stack<>();
        for (int i = 0; i < n; i++) {
            nums.push(Integer.parseInt(secondLine[i]));
        }
        for (int i = 0; i < s; i++) {
            nums.pop();
        }

        boolean isPresent = false;
        if (nums.contains(x)) {
            isPresent = true;
            System.out.println(isPresent);
        } else {
            while (nums.size() > 0) {
                int currentNum = nums.pop();
                if (currentNum < smallest) {
                    smallest = currentNum;
                }
            }
            if (smallest == Integer.MAX_VALUE) {
                smallest = 0;
            }
            System.out.println(smallest);
        }
    }
}
