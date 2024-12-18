//Diamond problem occurs when we try to implement multiple inheritance using classes.
//NOTE: This program won't compile.
class A{
    int i = 10;
    A(){
        System.out.println("Inside A");
    }
}
class B1 extends A{
    int j = 20;
    B1(){
        System.out.println("Inside B1");
    }
}
class B2 extends A{
    int k = 30;
    B2(){
        System.out.println("Inside B2");
    }
}
class C extends B1, B2{
    int l = 40;
    C(){
        System.out.println("Inside C");
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("A has i = "+a.i);
        System.out.println("**************************************************************************");
        B1 b1 = new B1();
        System.out.println("B1 has j = "+b1.j+" and  A's i = "+b1.i);
        System.out.println("**************************************************************************");
        B2 b2 = new B2();
        System.out.println("B2 has k = "+b2.k+" and  A's i = "+b2.i);
        System.out.println("**************************************************************************");
        C c = new C();
        System.out.println("C has l = "+c.l);
        System.out.println("**************************************************************************");
    }
}
