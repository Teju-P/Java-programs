public class MethodOverloading {
    static int sum(int a, int b){
        return (a+b);
    }
    static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void sum(double a, double b, double c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        System.out.println(sum(5,6));
        sum(1,2,3);
        sum(1.2,4.5,6.9);
    }
}
