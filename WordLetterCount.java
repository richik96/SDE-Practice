import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordLetterCount {

    public static void main(String[] args) {


        String res = "Richik Dutta Kolkata";

        String[] resList = res.split(" ");

        for(String s : resList) {
            System.out.println(s);
            Map<Character, Long> charCount = s.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            //System.out.println(charCount);

            for(Map.Entry<Character, Long> r : charCount.entrySet()) {
                System.out.println(r.getKey() + "--> " + r.getValue());
            }
        }
    }
}
