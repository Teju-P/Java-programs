package Revision_programs;

import java.util.Arrays;

public class FindSecLargestNumInArray {
    public static void main(String[] args) {
        int a[] = new int[]{75,42,87,63,12,13,25};
        Arrays.sort(a); //permanently sorts
        System.out.println(Arrays.toString(a));
        System.out.println("Second largest = "+a[a.length-2]);
    }
}
