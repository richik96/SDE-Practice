import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccuranceTest {

    public static void main(String[] args) {

        int[] arr = {1,4,2,7,1,8,2,4,1};
        Map<Integer, Integer> result = new HashMap<>();
//        Arrays.stream(arr)
//                .forEach(integer -> {
//                    if(result.containsKey(integer)) {
//                        result.put(integer, result.get(integer)+1);
//                    }
//                    else {
//                        result.put(integer, 1);
//                    }
//                });
//        result.forEach((a,b) -> System.out.println( a +" -> " +b));
//
        for(int i:arr) {
            result.compute(i, (key, count) -> count==null ? 1 : count+1);
        }
        System.out.println(result);
    }
}
