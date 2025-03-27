package SDE_Practice.ArrayDSA;

public class LongestIncreasingArray {

    public static void main(String[] args) {

        int[] A = {1,4,2,6,8,6,4};
        //find the size of the longest increasing array
        System.out.println("The longest increasing array size will be :\n"+arraySize(A));
    }
    static int arraySize(int[] a) {
        int temp = 0;
        int count = 0;
        for(int arr: a) {
            if(temp < arr) {
                temp = arr;
                count++;
            }
        }
        return count;
    }
}
