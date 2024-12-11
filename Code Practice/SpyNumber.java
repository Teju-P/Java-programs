/*Spy number:Product and sum of all digits in a number should be equal.
132: 1+3+2 = 1*3*2
 */
import java.util.Scanner;

class SpyNumber{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int nx = n;
        int sum=0, prod=1;
        while(nx>0){
            int temp = nx%10;
            sum+=temp;
            prod*=temp;
            nx/=10;
        }
        if(sum==prod) System.out.println(n+" is a spy number");
        else System.out.println(n+" is not a spy number");
    }
}