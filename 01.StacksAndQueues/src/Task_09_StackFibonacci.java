import java.util.Scanner;
import java.util.Stack;

public class Task_09_StackFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Long> fibonacci = new Stack<Long>();
        fibonacci.push(1L);
        fibonacci.push(1L);

        int index = 2;
        while (index <= n) {
            long poped = fibonacci.pop();
            long peeked = fibonacci.peek();
            fibonacci.push(poped);
            long next = poped + peeked;
            fibonacci.push(next);
            index++;
        }
        System.out.println(fibonacci.peek());
    }
}
