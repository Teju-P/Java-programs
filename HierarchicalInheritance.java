class A{
    int a;
    A(int x){
        a = x;
    }
}

class B extends A{
    int b;
    B(int y){
        super(10);
        b = y;
    }
}

class C extends A{
    int c;
    C(int z){
        super(20);
        c = z;
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        C ob = new C(255);
        B ob2 = new B(1024);
        System.out.println("c = "+ob.c);
        System.out.println("b = "+ob2.b);
        System.out.println("a from C= "+ob.a);
        System.out.println("a from B= "+ob2.a);
    }
}
