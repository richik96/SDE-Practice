package SDE_Practice.Sorting;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class BubbleSortTest {

    public static void main(String[] args) {

        int[] nums = {34, 45, 12, 8, 5, 95, 76};
        System.out.println("Before sorting :\n "+Arrays.toString(nums));

        System.out.println();
        System.out.println("After sorting :");
        bubbleSort(nums);

        System.out.println("Sorting using TreeSet :");
        Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(TreeSet::new))
                .forEach(a -> System.out.print(a + " "));
    }

    static void bubbleSort(int[] num) {
        for(int i=0; i< num.length; i++) {          //34
            for(int j=1; j< num.length-i; j++) {       //45, 12
                if(num[j-1] > num[j]) {         //34>45 ?
                    int temp = num[j];          //temp = 45
                    num[j] = num[j-1];          // j = 34
                    num[j-1] = temp;            // i = 45
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
