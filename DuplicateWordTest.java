import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordTest {

    public static void main(String[] args) {


        String[] str = {"spring", "ruby spring", "java spring"};
        //find count of spring

        Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> {
                    if (key.contains("spring"))
                        System.out.println(key + " -->" + value);
                });
        long res = Arrays.stream(str).map(x -> x.split(" "))
                .flatMap(Arrays::stream).filter(x -> x.equals("spring")).count();

        System.out.println("Different way of doing the same :\n"+res);
    }
}
