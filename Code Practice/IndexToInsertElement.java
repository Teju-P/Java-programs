/*You are given a sorted array of unique integers. It is given that each element in the array is unique. Also, an element is given. Write a Java program to find the index of the element present in the array. If the element is not present in the array, then find the index where it should be put in the array so that the array remains sorted even after putting the element.  */

import java.util.Scanner;

public class IndexToInsertElement {
    public static void main(String[] args) {
        int a[] = new int[]{2 ,6, 9, 13, 24, 35, 78, 90, 99};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]<num) continue;
            else{
                if(a[i-1]==num){
                    System.out.println("Index suited for "+num+" is "+(i-1));
                    break;
                }
                else{
                    System.out.println("Index suited for "+num+" is "+(i));
                    break;
                }
            }
        }
    }
}
