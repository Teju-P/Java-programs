import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        int a[] = {5,3,4,1,2};
        System.out.println("Before sorting: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting: "+Arrays.toString(a));
        Integer aNew[] = new Integer[a.length];
        int x = 0;
        for(int i:a){
            aNew[x++] = i;
        }
        Arrays.sort(aNew, Collections.reverseOrder());
        System.out.println("After reversing: "+Arrays.toString(aNew));
    }
}
