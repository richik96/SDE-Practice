import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringCountTest {

    public static void main(String[] args) {

        String[] str = {"dog", "cat", "rabbit", "Elephant", "zebra", "snake"};

        //group by the number of characters in each string

        Map<Integer, Integer> res = new HashMap<>();
        for(String j : str) {
            if(res.containsKey(j.length())) {
                res.put(j.length(), res.get(j.length())+1);
            }
            else {
                res.put(j.length(), 1);
            }
        }
        for(Map.Entry<Integer, Integer> i : res.entrySet()) {
            System.out.println("String with "+i.getKey()+" characters : "+i.getValue());
        }
    }
}
