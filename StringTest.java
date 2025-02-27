import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTest {

    public static void main(String[] args) {

        String s = "there is a tree tree has leaves leaves are green";

        //code to count the number of repeated words
        String[] str = s.split(" ");

        Map<String, Long> res = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        res.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key + " --> " + value);
            }
        });
        //System.out.println(res);
    }
}
