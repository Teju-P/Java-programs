
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class CountDigitOccurance {
    public static void main(String[] args) {
        int n = 1352264250;
        int nx = n, ny = n;
        HashSet<Integer> hs = new HashSet<>();
        while(n!=0){
            int temp = n%10;
            hs.add(temp);
            n= n/10;
        }
        System.out.println("hs = "+hs);
        String s = String.valueOf(nx);
        System.out.println("s: "+s);
        char []c = s.toCharArray();
        for(char ci:c){
            System.out.print(ci+" ");
        }
        System.out.println();
        int count = 0;
        //Convert HashSet into ArrayList as Set doesn't provide any method to fetch an element as sets don't maintain any order.
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }System.out.println();
        
        
    }
}
