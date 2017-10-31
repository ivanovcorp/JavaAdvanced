import java.util.Scanner;

/**
 * Created by ivano on 2/2/2017.
 */
public class Task_06_ReverseAndExecute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //System.out.println(30 % 3);
        String line = sc.nextLine();
        String[] inputNums = line.split("\\s+");

        Integer divider = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < inputNums.length; i++) {
            Integer currentNUm = Integer.parseInt(inputNums[inputNums.length - 1 - i]);
            if (currentNUm % divider != 0) {
                System.out.print(currentNUm + " ");
            }
        }
    }
}
