public class Recursion_Factorial {

    static int fact(int n){
        if(n>=0){
            if(n==0) return 1;
            while (n!=1) {
                return n*fact(n-1);
            }
            return n;
        }
        else return 9;
    }
    public static void main(String[] args) {
        System.out.println(fact(7));
    }
}
