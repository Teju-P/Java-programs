import java.util.Scanner;
import java.lang.Math;

public class CheckPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int root_value = (int)Math.sqrt(n);
        System.out.println("Root("+n+") = "+root_value);
        if(n == root_value*root_value) System.out.println(n+" i is a perfect square of "+root_value);
        else System.out.println(n+" is not a perfect square");
    }
}
