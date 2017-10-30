import java.util.Scanner;
import java.util.Stack;

public class Task_10_SimpleTextEditor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String text = "";

        Stack<String> previousCommands = new Stack<>();
        Stack<String> previousArguments = new Stack<>();
        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            if (command[0].equals("1")) {
                text += command[1];
                previousCommands.push("1");
                previousArguments.push(command[1]);
            } else if (command[0].equals("2")) {
                String texToAddArgument = text.substring(text.length() - Integer.parseInt(command[1]));
                previousArguments.push(texToAddArgument);
                text = text.substring(0, (text.length() - Integer.parseInt(command[1])));
                previousCommands.push("2");
            } else if (command[0].equals("3")) {
                System.out.println(text.charAt(Integer.parseInt(command[1]) - 1));
            } else {
                if (previousCommands.size() > 0) {
                    if (previousCommands.pop().contains("1")) {
                        int lenghtToCut = previousArguments.pop().length();
                        if (lenghtToCut >= text.length()) {
                            text = "";
                        } else {
                            text = text.substring(0, text.length() - lenghtToCut - 1);
                        }

                    } else {
                        text += previousArguments.pop();
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
