import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is the largest");
            System.exit(0);
        }
        else if(b>c){
            System.out.println(b+" is the largest");
            System.exit(0);
        }
        else{
            System.out.println(c+" is the largest");
            System.exit(0);
        }

        //Or use ternary operator
        int res = ((a>b && a>c)?a:((b>c)?b:c));
        System.out.println("Largest number is: "+res);
    }
}
