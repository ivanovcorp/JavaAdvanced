import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Task_04_BasicQueueOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstLine = sc.nextLine().split(" ");
        String[] secondLine = sc.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        int smallest = Integer.MAX_VALUE;
        Queue<Integer> nums = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(secondLine[i]));
        }
        for (int i = 0; i < s; i++) {
            nums.poll();
        }

        boolean isPresent = false;
        if (nums.contains(x)) {
            isPresent = true;
            System.out.println(isPresent);
        } else {
            while (nums.size() > 0) {
                int currentNum = nums.poll();
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
