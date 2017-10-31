import java.util.Scanner;

/**
 * Created by ivano on 1/31/2017.
 */
public class Task_01_ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder input = new StringBuilder(sc.nextLine()).reverse();
        System.out.println(input);
    }
}
