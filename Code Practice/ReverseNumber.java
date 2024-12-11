import  java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        System.out.print("Reverse of "+num+" = ");
        int temp;
        while(num!=0){
            temp = num%10;
            System.out.print(temp);
            num/=10;
        }
    }
}
