import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,2,5,7,1,3,2,5,8,7};
        int temp[] = new int[a.length];
        System.out.println("Before removing duplicate elements: ");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.sort(a);
        System.out.println("After sorting: ");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        int x =0;
        for(int i = 0;i<a.length-1;i++){    // 1 1 2 2 2 3 5 5 7 7 8
            if(a[i]!=a[i+1]) temp[x++] = a[i];
        }
        temp[x++] = a[a.length-1];

        //declaring new array
        int arr[] = new int[x];

        //writing elements back to original array
        for(int i=0;i<x;i++){
            arr[i]=temp[i];
        }

        System.out.println("After reving duplicate element: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
