//Try it in online compiler.

interface A{
    //NOTE: Interface can only have abstract methods when the method is public. If the "default" keyword is specified, then we can specify the body.
    default void getMessage(){
        System.out.println("Inside interface A");
    }
}

interface B{
    //NOTE: Interface can only have abstract methods when the method is public. If the "default" keyword is specified, then we can specify the body.
    default void getMessage(){
        System.out.println("Inside interfae A");
    }
}

public class MultipleInheritance implements A, B{
    public void getMessage(){
        System.out.println("Inside main()");
    }

    public void getMessageA(){
        A.super.getMessage();
    }

    public void getMessageB(){
        B.super.getMessage();
    }

    public static void main(String[] args) {
        MultipleInheritance o = new MultipleInheritance();
        o.getMessage();
        //A.super.getMessage(); We can't directly call implemented interface's methods. So create a method in main() that makes this call. 
        //B.super.getMessage();
        o.getMessageA();
        o.getMessageB();
    }
}
