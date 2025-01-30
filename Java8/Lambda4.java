package Java8;

interface Arithmetic{
    int operation(int a, int b);
}

public class Lambda4 {
    public static void main(String[] args) {
        Arithmetic add = (a, b) -> {return a+b;};
        Arithmetic sub = (a, b) -> a-b;
        Arithmetic mul = (a, b) -> a*b;
        Arithmetic div = (a, b) -> a/b;

        System.out.println(add.operation(10, 2));
        System.out.println(sub.operation(10, 2));
        System.out.println(mul.operation(10, 2));
        System.out.println(div.operation(10, 2));
        
    }
}
