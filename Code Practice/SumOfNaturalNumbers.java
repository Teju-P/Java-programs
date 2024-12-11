import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = n*(n+1)/2;
        System.out.printf("Sum of first %d natural numbers is %d ", n, sum);
    }
}
