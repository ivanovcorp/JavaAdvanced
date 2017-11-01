package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_06_FilterStudentsByPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> names = new ArrayList<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            if (data[2].startsWith("02") || data[2].startsWith("+3592")) {
                String name = data[0] + " " + data[1];
                names.add(name);
            }

            input = sc.nextLine();
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
