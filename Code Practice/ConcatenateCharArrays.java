import java.util.Arrays;

public class ConcatenateCharArrays {
    public static void main(String[] args) {
        char c1[] = new char[]{'a','b','c','d'};
        char c2[] = new char[]{'e','f','g','h'};
        System.out.println("c1 = "+Arrays.toString(c1));
        System.out.println("c2 = "+Arrays.toString(c2));
        char concatenatedArray[] = new char[c1.length+c2.length];
        System.arraycopy(c1, 0, concatenatedArray, 0, c1.length);
        System.arraycopy(c2, 0, concatenatedArray, c1.length, c2.length);
        System.out.println("concatenatedArray = "+Arrays.toString(concatenatedArray));
    }
}
