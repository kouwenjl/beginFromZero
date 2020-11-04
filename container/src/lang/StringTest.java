package lang;

public class StringTest {
    public static void main(String[] args) {
        System.out.println("ab".codePointAt(1));
        System.out.println('\uDc00');
        System.out.println('\uDFFF');
    }
}
