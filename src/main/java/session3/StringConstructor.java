package session3;

public class StringConstructor {

    public static void main(String[] args) {
        int alphabet_len = 26;
        char[] alphabet = new char[alphabet_len];
        int[] integers = new int[alphabet_len];
        byte[] bytes = new byte[alphabet_len];
        int i = 0;

        for (char c = 'a'; c <= 'z'; c++, i++) {
            alphabet[i] = c;

            integers[i] = (int) c;

            bytes[i] = (byte) c;
        }

        String charString = new String(alphabet);
        System.out.println("charString = " + charString);

        String byteString = new String(bytes);
        System.out.println("byteString = " + byteString);

        String intString = new String(integers, 0, alphabet_len);
        System.out.println("intString = " + intString);

        int offset = 1;
        String charString2 = new String(alphabet, offset, alphabet_len - offset);
        System.out.println("charString2 = " + charString2);

        offset = 5;
        int length = 5;
        String intString2 = new String(integers, offset, length);
        System.out.println("intString2 = " + intString2);
    }
}
