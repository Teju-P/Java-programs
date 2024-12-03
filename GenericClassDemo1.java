class Gen<T>{
    T ob;
    Gen(T o){
        ob = o;
    }
    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Type of T is "+ob.getClass().getName());
    }
}

public class GenericClassDemo1 {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);
        iob.showType();
        int i = iob.getOb(); //Auto unboxing.
        System.out.println("iob = "+i);
        Gen<String> sob = new Gen<String>("Teju");
        sob.showType();
        System.out.println("sob = "+sob.getOb().toString());
    }
}
