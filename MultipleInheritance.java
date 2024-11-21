interface A{
    int i=10;
    public void say();
}

interface B{
    int i=20;
    void what();
}

class C implements A, B{
    public void say(){
        System.out.println("A...");
    }
    public void what(){
        System.out.println("B...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        //System.out.println(obj.i);   Error: AMBIGUOUS
        System.out.println(A.i);
        System.out.println(B.i);
        obj.say();
        obj.what();
    }
}
