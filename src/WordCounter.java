import java.util.ArrayList;

public class WordCounter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape", "apple", "banana",
                "grape", "apple", "potato", "tomato", "chocolate", "juice", "potato", "car"};

        ArrayList<String> uniqueWords = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            boolean found = false;

            for (int j = 0; j < uniqueWords.size(); j++) {
                if (words[i].equals(uniqueWords.get(j))) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                uniqueWords.add(words[i]);
            }
        }

        System.out.println("Уникальные слова:");
        for (int i = 0; i < uniqueWords.size(); i++) {
            System.out.println(uniqueWords.get(i));
        }

        System.out.println();

        for (int i = 0; i < uniqueWords.size(); i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (uniqueWords.get(i).equals(words[j])) {
                    count++;
                }
            }
            System.out.println("Слово '" + uniqueWords.get(i) + "' встречается " + count + " раз(а).");
        }
    }
}