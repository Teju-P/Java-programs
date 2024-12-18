import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastOccurance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[]{10,40,60,20,10,45,60,75};
        System.out.println("a[] =  "+Arrays.toString(a));
        System.out.print("Enter n = ");
        int n = sc.nextInt(); 
        boolean flag = false;
        for(int i=0;i<a.length;i++){
            if(n==a[i]){
                System.out.println("First index = "+(i+1));
                flag = true;
                break;
            }
        }
        for(int i=a.length-1;i>=0;i--){
            if(n==a[i]) {
                System.out.println("Last index = "+(i+1));
                break;
            }
        }
        if(flag==false) System.out.println(n+" is not in the list");
        

    }   
}
