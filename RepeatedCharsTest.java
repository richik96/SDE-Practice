import java.util.HashSet;
import java.util.Set;

public class RepeatedCharsTest {

    public static void main(String[] args) {

        String str = "capgeminikolkata";
        //get the first repeated character

        Set<Character> seen = new HashSet<>();

        char res = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c ->
                        (!seen.add(c))
                )
                .findFirst()
                .orElse(null);

        System.out.println("First repeated character : "+res);

        //count of repeated charaters
        Set<Character> seen2 = new HashSet<>();
        long count = str.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> !seen2.add(c))
                .count();
        System.out.println("Count of repeated characters : "+count);


        Set<Character> seen3 = new HashSet<>();
        System.out.println("Repeated character :");
        str.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> !seen3.add(c))
                .forEach(System.out::println);
    }
}
