import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        int b [] = a;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i:a){
            al.add(i);
        }
        Collections.reverse(al);
        System.out.println(al);
        for(int i:b){
            System.out.print(i+" ");
        }System.out.println();
        for(int i=b.length-1;i>=0;i--){
            System.out.print(b[i]+" ");
        }
    }
}