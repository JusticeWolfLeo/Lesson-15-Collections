import java.util.*;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] sentenceSplit = sentence.split(" ");
        Set<String> setSplit = new HashSet<>(Arrays.asList(sentenceSplit));
        String stringResult = removeZap(String.join(" ", setSplit));
        System.out.println(stringResult);
    }

    public static String removeZap(String source) {
        return source.replaceAll(",", "");
    }


}


