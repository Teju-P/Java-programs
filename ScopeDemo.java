public class ScopeDemo {
    public static void main(String[] args) {
        int x = 10;
        {
            int y = 20;
            System.out.println(x);
            System.out.println(y);
        }
        // System.out.println(y); // will give error as y is not defined in outer scope.
        int y = 30;
        System.out.println(y);
    }
}
