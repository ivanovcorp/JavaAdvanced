package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Task_01_StudentsByGroup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayList<String> names = new ArrayList<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            if (data[2].equals("2")) {
                String name = data[0] + " " + data[1];
                names.add(name);
            }

            input = sc.nextLine();
        }

        Collections.sort(names, (s1, s2) -> s1.split(" ")[0].compareTo(s2.split(" ")[0]));

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
