import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductsTest {

    public static void main(String[] args) {

        Map<String, Integer> res = new HashMap<>();

        res.put("Mobiles", 1098);
        res.put("Laptops", 453);
        res.put("headphones", 972);
        res.put("speakers", 800);

        int threshold = 500;

        Map<String, Integer> result = res.entrySet()
                .stream()
                .filter(x -> x.getValue()>threshold)
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) ->
                                e1, LinkedHashMap::new
                ));
        System.out.println(result);
    }

}
