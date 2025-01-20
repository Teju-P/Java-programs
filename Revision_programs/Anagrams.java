package Revision_programs;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "Angel";
        String s2 = "Angle";
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println("c1 = "+Arrays.toString(c1));
        System.out.println("c2 = "+Arrays.toString(c2));
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));
        System.out.println(Arrays.equals(c1, c2));
    }
}
