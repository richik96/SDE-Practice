import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccuranceTest {

    public static void main(String[] args) {

        int[] arr = {1,4,2,7,1,8,2,4,1};
        Map<Integer, Integer> result = new HashMap<>();
        Arrays.stream(arr)
                .forEach(integer -> {
                    if(result.containsKey(integer)) {
                        result.put(integer, result.get(integer)+1);
                    }
                    else {
                        result.put(integer, 1);
                    }
                });
        result.forEach((a,b) -> System.out.println( a +" -> " +b));
//
//        for (int j : arr) {
//            if (res.containsKey(j)) {
//                res.put(j, res.get(j) + 1);
//            } else {
//                res.put(j, 1);
//            }
//        }
//        for(Map.Entry<Integer, Integer> i : result.entrySet()) {
//            System.out.println(i.getKey()+ " : "+i.getValue());
//        }
    }
}
