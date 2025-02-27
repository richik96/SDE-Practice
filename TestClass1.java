import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class TestClass1 {
    public static void main(String[] args) {

        //wordsList = ("hello", "bye", "hi", "bye", "hi");
        //o/p:{hi=2, hello=1, bye=2} using stream api

        String[] wordsList = {"hello", "bye", "hi", "bye", "hi"};
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : wordsList) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCount);

        //using stream api
        List<String> words = List.of(wordsList);
        Map<String, Long> wordCountStream = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(wordCountStream);
    }
}