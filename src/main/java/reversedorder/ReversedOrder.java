package reversedorder;

public class ReversedOrder {
    public String getWordsInReversedOrder(String[] words) {
        StringBuilder reverse = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (i == 0) {
                reverse.append(words[i]);
            } else {
                reverse.append(words[i]);
                reverse.append(", ");
            }
        }
        return reverse.toString();
    }
}
