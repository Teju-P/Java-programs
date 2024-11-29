class A{
    A(){
        System.out.println("Inside A");
    }
}

class B extends A{
    B(){
        System.out.println("Inside B");
    }
}

class C extends B{
    int i=30;
    C(){
        System.out.println("Inside C");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C cob = new C();
        System.out.println(cob.i);
    }    
}
