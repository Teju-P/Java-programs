class Gen<T,U>{
    T t;
    U u;
    Gen(T x, U y){
        t=x;
        u=y;
    }
    void showType(){
        System.out.println("Type of T is "+t.getClass().getName());
        System.out.println("Type of U is "+u.getClass().getName());
    }
    T getT(){
        return t;
    }
    U getU(){
        return u;
    }
}

public class GenericClassDemo2 {
    public static void main(String[] args) {
        Gen<String, Integer> x = new Gen("Teju", 22);
        x.showType();
        String s = x.getT();
        System.out.println("Name: "+s);
        System.out.println("Age: "+x.getU().intValue());
    }
}
