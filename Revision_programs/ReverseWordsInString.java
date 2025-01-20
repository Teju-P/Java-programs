package Revision_programs;

import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "My name is Teju";
        String sArray[] = s.split(" ");
        StringBuffer sb ;
        for(String x:sArray){
            sb = new StringBuffer(x);
            System.out.print(sb.reverse()+" ");
        }System.out.println();
    }
}
