/*Special number / Krishnamurthy number / Strng number:
  n = 145
  1!+4!+5! = 145
  i.e., that number is same as the sum of factorials of all digits of that number.
 */
import  java.util.Scanner;

public class SpecialNumber {

    public static int fact(int x){
        if(x==0) return 1;
        else return x*fact(x-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int n_copy = n;
        int sum= 0;
        while(n>0){
            int temp;
            temp = n%10;
            sum += fact(temp);
            n = n/10;
        }
        System.out.println("Number n = "+n_copy);
        System.out.println("Sum = "+sum);
        if(n_copy == sum) System.out.println(n_copy+" is a special number");
        else System.out.println(n_copy+" is not a special number");
    }    
}
