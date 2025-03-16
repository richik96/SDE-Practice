public class FindStringTest {

    public static void main(String[] args) {

        String str = "abcjkljruhbcabcijlkjabc";
        String target = "abc";
        String replacedStr = str.replaceAll(target, "");

        int count = (str.length() - replacedStr.length())/target.length();
        System.out.println(count);
    }
}
