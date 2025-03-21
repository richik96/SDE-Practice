package SDE_Practice;

public class MaxSubarraySumKadane {

    public static void main(String[] args) {

        int[] res = {2, -3, 4, -1, -2, 1, 5, -3};

        //maximum subarray sum

        int max_sum = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0; i< res.length; i++) {
            sum = sum+res[i];
            max_sum = Math.max(sum, max_sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max_sum);
    }
}
