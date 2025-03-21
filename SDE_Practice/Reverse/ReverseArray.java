package SDE_Practice.Reverse;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {4, 5, 87, 9, 14, 53};

        System.out.println("Befor reversal :\n" + Arrays.toString(arr));

        System.out.println("After reversal : \n" +Arrays.toString(reverseArray(arr)));

    }

    static int[] reverseArray(int[] a) {
        int j = a.length-1;
        int i = 0;
        while(i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
            i++;
        }
        return a;
    }
}
