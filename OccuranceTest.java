import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccuranceTest {

    public static void main(String[] args) {

        int[] arr = {1,4,2,7,1,8,2,4,1};
        Map<Integer, Integer> res = new HashMap<>();
        for (int j : arr) {
            if (res.containsKey(j)) {
                res.put(j, res.get(j) + 1);
            } else {
                res.put(j, 1);
            }
        }
        for(Map.Entry<Integer, Integer> i : res.entrySet()) {
            System.out.println(i.getKey()+ " : "+i.getValue());
        }
    }
}
