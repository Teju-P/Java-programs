package Revision_programs;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int a[] = {5,1,4,2};
        int n = a.length+1; //Adding 1 because w.k.t. a number is missing from the array
        int sumOfN = n*(n+1)/2;
        int sumOfElementsInArray = 0;
        for(int i:a){
            sumOfElementsInArray+=i;
        }
        System.out.println("Missing element is "+(sumOfN-sumOfElementsInArray));

//NOTE: This only works on an array having natural numbers starting from 1 to n.
    }
}
