import java.util.ArrayDeque;
import java.util.Scanner;

public class Task_06_TruckTour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayDeque<Station> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split(" ");
            int gas = Integer.valueOf(tokens[0]);
            int distance = Integer.valueOf(tokens[1]);
            Station station = new Station();
            station.gasGiven = gas;
            station.distanceToNext = distance;

            queue.addLast(station);
        }

        int gasInTank = 0;
        boolean foundFirst = false;
        int index = 0;

        while (true) {
            Station current = queue.removeFirst();
            gasInTank += current.gasGiven;
            queue.addLast(current);

            Station first = current;
            Integer indexAddUp = 1;

            while (gasInTank >= current.distanceToNext) {
                gasInTank -= current.distanceToNext;
                current = queue.removeFirst();
                queue.addLast(current);
                gasInTank += current.gasGiven;
                indexAddUp++;

                if (current == first) {
                    foundFirst = true;
                    break;
                }
            }
            if (foundFirst) {
                break;
            }

            index += indexAddUp;
            gasInTank = 0;
        }

        System.out.println(index);
    }
}

class Station {
    int gasGiven;
    int distanceToNext;
}
