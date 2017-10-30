import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ivano on 1/30/2017.
 */
public class Task_08_HandsOfcards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        HashMap<String, HashSet<String>> personCards = new HashMap<>();

        while (!line.contains("JOKER")) {
            String[] arr = line.split(":");
            String currKey = arr[0];
            String[] cards = arr[1].split(", ");
            String[] correctCards = new String[cards.length];
            for (int i = 0; i < correctCards.length; i++) {
                correctCards[i] = cards[i].trim();
            }
            HashSet<String> currCards = new HashSet<>();
            for (String correctCard : correctCards) {
                currCards.add(correctCard);
            }

            if (!personCards.containsKey(currKey)) {
                personCards.put(currKey, currCards);
            } else {
                HashSet<String> oldCards = personCards.get(currKey);
                personCards.remove(currKey);
                for (String oldCard : oldCards) {
                    currCards.add(oldCard);
                }
                personCards.put(currKey, currCards);
            }

            line = sc.nextLine();
        }


        for (Map.Entry<String, HashSet<String>> entry : personCards.entrySet()) {
            HashSet<String> currPersonCards = entry.getValue();
            int finalScore = 0;
            for (String currPersonCard : currPersonCards) {
                String[] card = currPersonCard.split("");
                int crrP = 0;
                int crrT = 0;
                int currScore = 0;
                switch (card[0]) {
                    case "2":
                        crrP = 2;
                        break;
                    case "3":
                        crrP = 3;
                        break;
                    case "4":
                        crrP = 4;
                        break;
                    case "5":
                        crrP = 5;
                        break;
                    case "6":
                        crrP = 6;
                        break;
                    case "7":
                        crrP = 7;
                        break;
                    case "8":
                        crrP = 8;
                        break;
                    case "9":
                        crrP = 9;
                        break;
                    case "10":
                        crrP = 10;
                        break;
                    case "J":
                        crrP = 11;
                        break;
                    case "Q":
                        crrP = 12;
                        break;
                    case "K":
                        crrP = 13;
                        break;
                    case "A":
                        crrP = 14;
                        break;
                }

                switch (card[1]) {
                    case "S":
                        crrT = 4;
                        break;
                    case "H":
                        crrT = 3;
                        break;
                    case "D":
                        crrT = 2;
                        break;
                    case "C":
                        crrT = 1;
                        break;
                }
                currScore = crrP * crrT;
                finalScore += currScore;

            }
            System.out.println(entry.getKey() + ": " + finalScore);

        }
    }
}
