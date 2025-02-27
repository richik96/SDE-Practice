

public class TestClass2 {

    public static void main(String[] args) {

        String a = "abc";
        String b = new String("abc");
        String c = "xyz";
        b =  c;

        System.out.println(a.hashCode() );
        System.out.println(b.hashCode());
        System.out.println(String.valueOf(b));
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
