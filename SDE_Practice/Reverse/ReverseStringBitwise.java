package SDE_Practice.Reverse;

public class ReverseStringBitwise {

    public static void main(String[] args) {


        String str = "Hello";

        String reversed = resverseString(str);

        System.out.println(reversed);
    }

    public  static  String resverseString(String str) {

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            //XOR Swap

            arr[left]  ^= arr[right];
            arr[right] ^= arr[left];
            arr[left] ^= arr[right];

            left++;
            right--;
        }
        return new String(arr);
    }
}
