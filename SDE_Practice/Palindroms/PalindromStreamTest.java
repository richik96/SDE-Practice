package SDE_Practice.Palindroms;

public class PalindromStreamTest {

    public static void main(String[] args) {

        String str = "jhddhj";
        System.out.println("The input is : "+ isPalindrom(str));
    }

    static boolean isPalindrom(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return reversed.equals(input);
    }
}
