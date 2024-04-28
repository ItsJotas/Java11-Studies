package session3;

public class StringRecap {
    public static void main(String[] args) {
        EqualLiteralReferences();
        StringConstructors();
    }

    public static void EqualLiteralReferences() {
        String s1 = "hello";

        String s2 = "hello";
        System.out.println("s1 and s2 are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));

    }

    public static void StringConstructors() {
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println("s1 and s2 are constructed String objects " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));
    }
}
