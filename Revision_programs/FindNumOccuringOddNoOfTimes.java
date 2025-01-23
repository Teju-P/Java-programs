package Revision_programs;

import java.util.TreeSet;

public class FindNumOccuringOddNoOfTimes {
    public static void main(String[] args) {
        int a [] = {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20, 20};
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i:a){
            ts.add(i);
        }
        System.out.println("ts = "+ts);
        
        for(int i:ts){
            int cout = 0;
            for(int j=0;j<a.length;j++){
                if(i==a[j]) cout++;
            }
            if(cout%2!=0) System.out.println(i+" occurs odd number of times in the array");
        }

    }
}
