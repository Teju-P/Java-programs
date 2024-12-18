import java.util.Arrays;

public class WaveSortArray {
    public static void main(String[] args) {
        //int a[] = new int[]{19 ,18 ,16 ,13 ,14 ,17 ,12};
        int a[] = new int[]{-45, 45, -50, -60, 0, 34, 9, 12};
        for(int i=2;i<a.length;i=i+2){
            int temp;
            if(a[i-1]>a[i] && i>0){
                temp = a[i-1];
                a[i-1] = a[i];
                a[i] = temp;
            }
            else if(a[i]<a[i+1] && i<a.length){
                temp = a[i+1];
                a[i+1] = a[i];
                a[i] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
