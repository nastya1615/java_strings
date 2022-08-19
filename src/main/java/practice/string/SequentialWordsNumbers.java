package practice.string;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text) {

        StringBuilder numerationWords = new StringBuilder("");
        int index = 1;


        for (int i = 0; ; ) {
            int a = text.indexOf(" ", i);
            if (a == -1) {
                String word = text.substring(i);

                if (word.isEmpty()) {
                    numerationWords.append(word);
                    break;
                } else {
                    numerationWords.append("(").append(index).append(") ").append(word);
                    break;
                }

            }

            String word = text.substring(i, a);
            i = a + 1;
            numerationWords.append("(").append(index).append(") ").append(word).append(" ");
            index++;


        }
        return numerationWords.toString();
    }
}
