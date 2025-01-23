package Revision_programs;

import java.util.Arrays;

public class FindFrequencyOfEachCharInArray {
    public static void main(String[] args) {
        int a[] = {1,3,2,1,5,7,1,3,3,5,2};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int count =0;
        int p=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]==p){
                count++;
            }
            else{
                System.out.println(a[i-1]+" = "+count);
                count = 1;
                p = a[i];
            }
            if(a[i]==a[a.length-1]){
                System.out.println(a[i]+" = "+count);
            }
        }
    }
}
