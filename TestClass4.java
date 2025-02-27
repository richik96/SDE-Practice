import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass4 {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1,2,3,4,3,2,5,6);

        //o/p--> 654321

        l1.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::print);
    }
}
