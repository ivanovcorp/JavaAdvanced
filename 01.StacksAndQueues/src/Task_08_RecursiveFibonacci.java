import java.util.Scanner;

public class Task_08_RecursiveFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int index = 0;
        long result = 1;
        while (index < n) {
            result += fibonacci(index);
            index++;
        }
        System.out.println(result);
    }

    public static long fibonacci(int i) {
        if (i == 0)
            return 0;
        else if (i <= 2)
            return 1;

        long fibTer = fibonacci(i - 1) + fibonacci(i - 2);
        return fibTer;
    }
}
