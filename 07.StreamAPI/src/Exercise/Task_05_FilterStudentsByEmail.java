package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_05_FilterStudentsByEmail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> names = new ArrayList<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            if (data[2].indexOf("@gmail.com") != -1) {
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
