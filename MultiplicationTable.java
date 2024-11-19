import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("\nPrinting multiplication table of number "+num);
        for(int i=1;i<11;i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
}
