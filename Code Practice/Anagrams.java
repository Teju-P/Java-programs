import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("a = "+Arrays.toString(a));
        System.out.println("b = "+Arrays.toString(b));
        boolean isEqual = Arrays.equals(a, b);
        if(isEqual) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
