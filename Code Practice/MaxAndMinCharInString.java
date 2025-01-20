import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class MaxAndMinCharInString {
    public static void main(String[] args) {
        //String s = "Grass is greener on the other side".toLowerCase();
        String s = "AabcaddefghhhA".toLowerCase();
        String sub [] = s.split(" ");
        s = "";
        for(String z:sub){
            s = s.concat(z);
        }
        System.out.println("s = "+
        s);
        char []c = s.toCharArray();
        Set<Character> hs = new HashSet<>();
        for(char x:c){
            hs.add(x);
        }
        ArrayList<Character> al = new ArrayList<>(hs);
        Collections.sort(al);
        System.out.println("al = "+al);
        char cNew[] = new char[al.size()];
        int y=0;
        for(char m:al){
            cNew[y++] = m;
        }
        System.out.println("cNew = "+Arrays.toString(cNew));
        char maxChar = cNew[0];
        char minChar = cNew[0];
        int count = 0;
        int prevMax = 0;
        int prevMin = s.length();
        for(int i=0;i<cNew.length;i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==cNew[i]) count++;
                else continue;
            }
            if(count>prevMax){
                prevMax = count;
                maxChar = cNew[i];
            }
            if(count<prevMin){
                prevMin = count;
                minChar = cNew[i];
            }
            //System.out.println("Iteration i = "+i+" minChar = "+minChar+" with "+prevMin+" maxChar = "+maxChar+" with "+prevMax+" count = "+count);
            count = 0;
        }
        System.out.println("MaxChar = "+maxChar);
        System.out.println("MinChar = "+minChar);
    }
}
