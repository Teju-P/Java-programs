package Revision_programs;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindDuplicateCharsInString {
    public static void main(String[] args) {
        String s = "asdfsf";
        s = s.replaceAll(" ", "");
        System.out.println("s = "+s);
        TreeSet<Character> ts = new TreeSet<>();
        for(int i=0;i<s.length();i++){
            ts.add(s.charAt(i));
        }
        System.out.println("ts = "+ts);
        int count =0;
        ArrayList<Character> al = new ArrayList<>(ts);
        System.out.println("al = "+al);
        for(int i=0;i<al.size();i++){
            for(int j=0;j<s.length();j++){
                if(al.get(i)==s.charAt(j)) count++;
                else continue;
            }
            if(count>1){
                System.out.println(al.get(i)+" is duplicate");
                count = 0;
            }
        }
    }
}
