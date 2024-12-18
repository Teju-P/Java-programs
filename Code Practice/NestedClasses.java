//Try executing in online java compiler.

public class NestedClasses {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Outer out = new Outer();
        Outer.Inner1 in1 = out.new Inner1();
        //Inner2 class is static, so no need of object to call the Inner2 constructor.
        Outer.Inner2 in2 = new Outer.Inner2();
    }
}

class Outer{
    Outer(){
        System.out.println("Outer class constructor");
    }
    class Inner1{
        Inner1(){
            System.out.println("Inner1 class constructor");
        }
    }
    static class Inner2{
        Inner2(){
            System.out.println("Inner2 class constructor");
        }
    }
}
