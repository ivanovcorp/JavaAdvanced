package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_03_StudentsByAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayList<String> names = new ArrayList<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            if (Integer.parseInt(data[2]) >= 18 && Integer.parseInt(data[2]) <= 24) {
                String name = data[0] + " " + data[1] + " " + data[2];
                names.add(name);
            }

            input = sc.nextLine();
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
