package StringPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class FindAllPermuOfString {

    public static int fact(int n){
        if(n==0 || n==1) return 1;
        else return n*fact(n-1);
    }
    public static void main(String[] args) {
        String s = "ABC";
        ArrayList<Character> al1 = new ArrayList<>();
        ArrayList<Character> al2 = new ArrayList<>();
        char c[] = s.toCharArray();
        for(char x:c){
            al1.add(x);
        }
        al2 = al1;
        System.out.println("al1 = "+al1);
        System.out.println("al1 = "+al2);
        int l = fact(s.length());
        System.out.println("fact = "+l);
        int count = 0;
        while(count<=l){
            Collections.shuffle(al1);
            if(al1.equals(al2)){
                continue;
            }
            else{
                System.out.println(al2);
                al2 = new ArrayList<>(al1);
                count++;
            }
        }

    }
}
