package Revision_programs;

public class FindPairWhoseSumIsCloseToZero {
    public static void main(String[] args) {
        int a[] = {1,3,-5,7,8,20,-40,6};
        //int a[] = {5};
        //int a[] = {-1,-2,-3,-4,-5};
        int minSum = Math.abs(a[0]+a[a.length-1]);
        int first = 0, second = a.length-1;
        if(a.length<2){
            System.out.println("Min 2 terms are required!");
            System.exit(1);
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(Math.abs(a[i]+a[j])<minSum){
                    minSum = Math.abs((a[i]+a[j]));
                    first = i;
                    second = j;
                }
            }
        }
        System.out.println("Sum min to zero is: "+a[first]+"+"+a[second]+"="+(a[first]+a[second]));

    }
}
