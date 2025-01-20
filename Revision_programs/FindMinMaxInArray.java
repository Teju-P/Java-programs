package Revision_programs;

public class FindMinMaxInArray {
    public static void main(String[] args) {
        int a[] ={7,5,6,1,4,2};
        //int b[] = new int[]{1,2,3};
        int max = a[0];
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max) max = a[i];
            else if(a[i]<min) min=a[i];
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);

    }
}
