class A{
    char a = 'a';
}

class B extends A{
    char b = 'b';
}

class C extends A{
    char c = 'c';
}

class D extends C{
    char d = 'd';
}

public class HybridInheritance {
    public static void main(String[] args) {
        D obd = new D();
        B obb = new B();
        C obc = new C();
        System.out.println("d = "+obd.d);
        System.out.println("c = "+obd.c);
        System.out.println("a = "+obd.a);

        System.out.println("b = "+obb.b);
        System.out.println("a = "+obb.a);

        System.out.println("c = "+obc.c);
        System.out.println("a = "+obc.a);
    }
}
