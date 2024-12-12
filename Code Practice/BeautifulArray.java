

/*
 Condition 1: Each element of the array must be greater than or equal to 1 and less than or equal to s, i.e., within 1 to s (size of the array).

Condition 2: Any repeated entries in the array are not allowed.

Condition 3: All the elements of the array must not be arranged in ascending order.

inputArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, size = 10 : not beautiful array : ascending.
inputArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 19, 10}, size = 10 : not beautiful array : element not between 1 and size.
inputArr[] = {1, 2, 3, 4, 5, 6, 7, 9, 9, 10}, size = 10 : not beautiful array : element repeated
inputArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 10, 9}, size = 10 : beautiful array.

 */

 import java.util.Arrays;

public class BeautifulArray {
    public static void main(String[] args) {
        //int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 19, 10};
        //int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 9, 10};
        int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 9};
        int b[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        
        int size = a.length;
        for(int i:a){
            if(i>size){
                System.out.println("Not beautiful array. Element>size");
                System.exit(0);
            }
        }
        
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                System.out.println("Not beautiful array. Duplicate element");
                System.exit(0);
            }
        }

        Arrays.sort(b);
        System.out.print("a = ");
        for(int i:a){
            System.out.print(i+" ");
        }System.out.println();

        System.out.print("b = ");
        for(int i:b){
            System.out.print(i+" ");
        }System.out.println();

        System.out.println(Arrays.equals(a, b)?"Not beautiful array. Ascending order":"Beautiful array");

    }
}
