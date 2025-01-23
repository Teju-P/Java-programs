package Revision_programs;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateOddAndEven {
    public static void main(String[] args) {
        int a[] = {11,12,7,9,15,42,86};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i:a){
            if(i%2==0){
                even.add(i);
            }
            else{
                odd.add(i);
            }
        }
        System.out.println("a[] = "+Arrays.toString(a));
        System.out.println("even[] = "+even);
        System.out.println("odd[] = "+odd);
        System.out.print("Odd and even together = [");
        for(int i:odd){
            System.out.print(i+", ");
        }
        for(int j:even){
            if(even.indexOf(j)==even.size()-1){
                System.out.println(j+"]");
            }
            System.out.print(j+", ");
        }
    }
}
