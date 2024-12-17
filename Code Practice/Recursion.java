
import java.util.Scanner;

//a^n = a(a^(n-1))

public class Recursion {

    public static double rec(double a, int n){
        if(n<0){
            return 1.0/(a*rec(a, -n-1));
        }
        return switch (n) {
            case 0 -> 1;
            case 1 -> a;
            default -> a*rec(a, n-1);
        };
    }

    public static void main(String[] args) {
        double a;
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Expression: a^n = a(a^(n-1))");
            System.out.print("Enter a: ");
            a = sc.nextDouble();
            System.out.print("Enter n: ");
            n = sc.nextInt();
        }
        double res = rec(a, n);
        System.out.println("Result = "+res);
    }
}
