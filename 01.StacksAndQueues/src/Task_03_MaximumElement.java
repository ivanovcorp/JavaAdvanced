import java.util.Scanner;
import java.util.Stack;

public class Task_03_MaximumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> nums = new Stack<>();
        for (int i = 0; i < n; i++) {
            int command = sc.nextInt();
            if (command == 1) {
                int numToAdd = sc.nextInt();
                nums.push(numToAdd);
            } else if (command == 2) {
                nums.pop();
            } else {
                int max = Integer.MIN_VALUE;
                for (Integer num : nums) {
                    if (num > max) {
                        max = num;
                    }
                }
                System.out.println(max);
            }
        }
    }
}
