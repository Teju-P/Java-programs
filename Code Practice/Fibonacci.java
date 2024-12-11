import java.util.Scanner;

class Fibonacci{
    public static int fib(int n){
        switch(n){
            case 1: return 0;
            case 2: return 1;
            default: return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("fib("+i+") = "+fib(i));
        }
    }
}