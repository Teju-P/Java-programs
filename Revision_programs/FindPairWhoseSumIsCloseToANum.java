package Revision_programs;

import java.util.Scanner;

public class FindPairWhoseSumIsCloseToANum {
    public static void main(String[] args) {
        int a[] = {-40,-5,1,3,6,7,8,20};
        int x = new Scanner(System.in).nextInt();
        int minSum = Math.abs(a[0]+a[1]-x);
        int first =0, second =0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(Math.abs(a[i]+a[j]-x)<minSum){
                    minSum = Math.abs(a[i]+a[j]-x);
                    first = i;
                    second = j;
                }
            }
        }
        System.out.println("Min sum close to "+x+" is "+a[first]+"+"+a[second]+"="+(a[first]+a[second]));
    }
}
