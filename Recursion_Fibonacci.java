public class Recursion_Fibonacci {
    static void fib(int n){
        int f1=0,f2=1;
        System.out.print(f1+" ");
        System.out.print(f2+" ");
        while (n>=3) {
            int f3 = f1+f2;
            System.out.print(f3+" ");
            f1 = f2;
            f2 = f3;
            n--;
        }
    }
    public static void main(String[] args) {
        fib(10); //0 1 1 2 3
    }
}
