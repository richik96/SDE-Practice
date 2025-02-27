import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestSum {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 65, 85, 7, 6, 4, 3);

        //sum of all the numbers
        int res = list.stream().reduce(Integer::sum).get();

        System.out.println("Sum : "+ res);
        //avg of all the numbers

        double avgRes = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("Average : "+ avgRes);
    }
}
