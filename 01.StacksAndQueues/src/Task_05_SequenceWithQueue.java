import java.util.ArrayDeque;
import java.util.Scanner;

public class Task_05_SequenceWithQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        ArrayDeque<Long> queue = new ArrayDeque<>();

        queue.add(n);

        for (int i = 0; i < 50; i++) {
            long curr = queue.removeFirst();

            System.out.printf("%s ", curr);

            long s1 = curr + 1;
            long s2 = 2 * curr + 1;
            long s3 = curr + 2;

            queue.addLast(s1);
            queue.addLast(s2);
            queue.addLast(s3);
        }
    }
}
