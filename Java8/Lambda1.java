package Java8;

interface FuncInterface{
    void abstractFunc(int x); //abstract method
    default void normalFunc(){
        System.out.println("Hello");
    }
}

public class Lambda1 {
    public static void main(String[] args) {
        FuncInterface fobj = (int x) -> {System.out.println(2*x);};
        fobj.abstractFunc(5);
    }
}
