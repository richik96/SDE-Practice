package SDE_Practice.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 11, 15};
        int target = 16;
        int[] result = mapTwoSum(arr, target);
        System.out.println("The indexes are : " +result[0] + "," +result[1]);
    }

    static int[] mapTwoSum(int[] a, int target) {
        Map<Integer, Integer> res = new HashMap<>();

        for(int i=0; i<a.length-1; i++) {
            int compliment = target - a[i];
            if(res.containsKey(compliment)) {
                return new int[] {res.get(compliment), i};
            }
            res.put(a[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }
}
