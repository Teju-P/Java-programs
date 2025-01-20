package Revision_programs;

import java.util.TreeSet;

public class CheckAllCharsAreUnique {
    public static void main(String[] args) {
        String s = "asdfgh"; //Apple
        char c[] = s.toCharArray();
        TreeSet<Character> ts = new TreeSet<>();
        for(int i=0; i<s.length();i++){
            ts.add(s.charAt(i));
        }
        System.out.println("ts = "+ts);
        if(ts.size()!=s.length()) System.out.println("False");
        else{
            System.out.println("True");
        }
    }
}
