package Revision_programs;

import java.util.Scanner;

public class FindAllPairsWhoseSumEqualsANum {
    public static void main(String[] args) {
        int a[] = { -40, -5, 1, 2, 3, 6, 7, 8, 20};
        int x = new Scanner(System.in).nextInt();
        int temp = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                temp = a[i]+a[j];
                if(temp==x){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}
