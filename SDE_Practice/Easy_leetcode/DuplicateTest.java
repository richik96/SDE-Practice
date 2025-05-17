package SDE_Practice.Easy_leetcode;

import java.util.HashMap;
import java.util.Map;

public class DuplicateTest {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 2, 5};

        System.out.println("Is duplicate ? " + findDuplicate(arr));
        System.out.println("Duplicate number is : " + findDuplicateNum(arr));
    }

    static boolean findDuplicate(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++) {
            if(map.containsKey(a[i])) {
                return false;
            }
            map.put(a[i], 0);
        }
        return true;
    }
    static int findDuplicateNum(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++) {
            if(map.containsKey(a[i])) {
                return a[i];
            }
            map.put(a[i], 0);
        }
        return -1;
    }
}
