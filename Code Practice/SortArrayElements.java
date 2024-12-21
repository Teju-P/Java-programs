import java.util.Arrays;
import java.util.Collections;

public class SortArrayElements {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 2, 8, 7, 1};
        System.out.println("Before sorting: ");
        for(int i:arr){
            System.out.print(i+" ");
        }System.out.println();

        /*for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }*/
        Arrays.sort(arr);
        // USe Arrays.sort(arr, Collections.reverseOrder()); if the array is of type wrapper class.

        System.out.println("After sorting: ");
        for(int i:arr){
            System.out.print(i+" ");
        }System.out.println();
    }
}
