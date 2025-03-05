package SDE_Practice;

public class ReverseIntTest {

    public static void main(String[] args) {

        //Given a signed 32-bit integer x, return x with its digits reversed.
        // If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// input = 123 output = 321
        int x = -245;

        System.out.println("The reversed number is : "+reverseInt(x));
    }

    static int reverseInt(int x) {
        int temp = Math.abs(x);
        int res = 0;
        while(temp > 0) {
            int ld = (temp % 10);    //245 % 10= 5
            if(res > (Integer.MAX_VALUE-ld)/10) {
                return 0;
            }
            res = (res * 10) + ld;
            temp = temp/10;
        }
        return (x<0) ? -res : res;
    }
}
