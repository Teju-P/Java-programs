class A{
    static int i = 50;
    static private int j = 105;
    static void getI(){
        System.out.println("i: "+i);
    }
    static void getJ(){
        System.out.println("j: "+j); // Variables we access inside static methods must also be static.
        //Otherwise it gives error: Can't make static reference to the non-static field j.
    }
}

class StaticVarAndMethodDemo {
    static int a = 10;
    int b = 20;
    static void staticFunc(){
        System.out.println("a: "+a);
    }
    void nonStaticFunc(){
        System.out.println("b: "+b);
    }
    public static void main(String[] args) {
        StaticVarAndMethodDemo svm = new StaticVarAndMethodDemo();
        System.out.println(a); // static variables can be accessed without object.
        System.out.println(svm.b);
        staticFunc(); // static methods can be called without object.
        svm.nonStaticFunc(); // non static methods need to be called using object
        A aob = new A();
        A.getI();
        A.getJ();
        System.out.println(A.i);
        //System.out.println(A.j); // In class A, variable j is private, so it isn't accessible outside the class A. But we can get it using getter function.
    }
}
