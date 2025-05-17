package SDE_Practice.ArrayDSA;

import java.util.HashMap;
import java.util.Map;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {

        int[] arr = {4, 2, 6, 5, 10, 11, 21};

        if (arr.length <= 1) {
            System.out.println("Longest increasing subsequent size will be : " + 1);
        } else {
            System.out.println("Longest increasing subsequence size will be : " + getAns(arr));
        }
    }

    static int getAns(int[] a) {

        Map<Integer, Integer> map = new HashMap<>();
        int ans = 1;
        for(int i=0; i< a.length; i++) {
            if (map.containsKey(a[i]+1) || map.containsKey(a[i]-1)) {
                map.put(a[i], 1+ Math.max(map.getOrDefault(a[i]+1, 0), map.getOrDefault(a[i]+1, 0)));
            }
            else {
                map.put(a[i], i);
            }
            ans = Math.max(ans, map.get(a[i]));

        }
        return ans;
    }
}
