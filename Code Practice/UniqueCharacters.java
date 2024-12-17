import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharacters {
    public static void findUnique(String s){
        char [] c = s.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        for(char e:c){
            hs.add(e);
        }
        ArrayList<Character> al = new ArrayList<>(hs);
        System.out.println("al = "+al);
        int count =0;
        boolean flag = true;
        
        for(int i=0;i<al.size();i++){
            count = 0;
            for(int j=0;j<c.length;j++){
                if(al.get(i)==c[j]) count++;
                else continue;
            }
            if(count ==1) {
                System.out.print(al.get(i)+" ");
                flag = false;
            }
        }System.out.println();
        //System.out.println("flag = "+flag);
        if(flag == true) System.out.println("No unique");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.next();
        System.out.println("WORD = "+word);
        findUnique(word); 
    }
}
