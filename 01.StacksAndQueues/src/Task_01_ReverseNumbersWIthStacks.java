import java.util.Scanner;
import java.util.Stack;

public class Task_01_ReverseNumbersWIthStacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] numsAsarray = input.split(" ");

        Stack<Integer> nums = new Stack<>();
        for (int i = 0; i < numsAsarray.length; i++) {
            nums.push(Integer.parseInt(numsAsarray[i]));
        }

        while (nums.size() > 0) {
            System.out.printf("%d ",nums.pop());
        }
    }
}
