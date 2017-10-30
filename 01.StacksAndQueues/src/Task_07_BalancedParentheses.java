import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Task_07_BalancedParentheses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] parentheses = input.split("");

        Stack<String> firsPart = new Stack<>();
        Queue<String> secondPart = new ArrayDeque<>();

        for (int i = 0; i < parentheses.length; i++) {
            if (parentheses[i].equals("(") ||
                    parentheses[i].equals("{") ||
                    parentheses[i].equals("[")) {
                firsPart.push(parentheses[i]);
            } else {
                secondPart.add(parentheses[i]);
            }
        }

        boolean isEqual = true;
        if (firsPart.size() == secondPart.size()) {
            while (firsPart.size() > 0) {
                String curr = firsPart.pop();
                String currSec;
                switch (curr) {
                    case "(":
                        currSec = secondPart.remove();
                        if (!currSec.equals(")")) {
                            isEqual = false;
                        }
                        break;
                    case "{":
                        currSec = secondPart.remove();
                        if (!currSec.equals("}")) {
                            isEqual = false;
                        }
                        break;
                    case "[":
                        currSec = secondPart.remove();
                        if (!currSec.equals("]")) {
                            isEqual = false;
                        }
                        break;
                }
                if (!isEqual) {
                    break;
                }
            }

            if (isEqual) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }

        System.out.println();
    }
}
