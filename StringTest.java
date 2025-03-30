import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringTest {

    public static void main(String[] args) {

        String s = "there is a tree tree has leaves leaves are green";

        //code to count the number of repeated words
        String[] str = s.split(" ");
        Map<String, Long> res = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("All repeated words :");
        res.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key + " --> " + value);
            }
        });

        //print the most repeated word
        System.out.println("The most repeated word is :");
        Map.Entry<String, Long> result = Arrays.stream(str)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        System.out.println(result.getKey() + " : "+ result.getValue());
    }
}
