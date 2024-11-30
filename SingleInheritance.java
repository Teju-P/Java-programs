class A{
    private int i=10; //private data members are not inherited.
    A(int x){
        i = x;
    }
    public int getI(){
        return i;
    }
}

class B extends A{
    private int j =35;
    B(int x){ //when we extend a class that has a parameterized constructor we must initialize superclass constructor in the subclass.
        super(x-10);
    }
    public void getJ(){
        System.out.println("j: "+j);
    }

}

public class SingleInheritance {
    public static void main(String[] args) {
        B ob = new B(30);
        ob.getJ();
        System.out.println("i: "+ob.getI());
    }
}