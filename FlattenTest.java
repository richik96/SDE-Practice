import java.util.Arrays;
import java.util.List;

public class FlattenTest {

    public static void main(String[] args) {

        List<List<String>> res = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));

        System.out.println("Before the operation :\n "+res);

        List<String> res2 = res.stream().flatMap(List::stream).toList();

        System.out.println("After :\n"+res2);
    }
}
