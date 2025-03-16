package SDE_Practice.Palindroms;

public class PalindromDsa {
    public static void main(String[] args) {
        int num = 97559;
        System.out.println(isPalindrom(num));
    }

    static boolean isPalindrom(int input) {
        int original = input;

        int reversed = 0;
        while(input != 0) {
            reversed = (reversed*10)+(input % 10);
            input = input/10;
        }
        return reversed==original;
    }
}
