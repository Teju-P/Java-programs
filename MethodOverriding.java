class A{
    private int i;
    A(int x){
        i = x;
    }
    public int getI(){
        return i;
    }
}

class B extends A{
    private int i;
    B(int m){
        super(m-10);
        i = m;
    }
    public int getI(){ // the same method is present in class A, but it is overridden by class B's method.
        return i;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A aob = new A(10);
        B bob = new B(20);
        System.out.println(aob.getI());
        System.out.println(bob.getI());
    }
}
